package br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.web;

import br.com.deoo.gym.deoo_gym.A_entity.Enuns.Gender;
import br.com.deoo.gym.deoo_gym.A_entity.Enuns.PhysicalGoal;
import br.com.deoo.gym.deoo_gym.A_entity.PhysicalCharacteristics;
import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.B_useCases.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@SessionAttributes("loggedInUser")
public class UserWebController {

    private final UserService userService;

    @Autowired
    public UserWebController(UserService userService) {
        this.userService = userService;
    }

    private User getLoggedInUser(HttpSession session) {
        return (User) session.getAttribute("loggedInUser");
    }

    @GetMapping("/add_user")
    public String showAddUserForm(Model model) {
        model.addAttribute("user", new User());
        return "add_user";
    }

    @PostMapping("/add_user")
    public String addUser(User user, Model model, HttpSession session) {
        try {
            userService.add(user);
            model.addAttribute("message", "Registration completed!!"); ////
            session.setAttribute("loggedInUser", user);
            return "redirect:/add_characteristics";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "add_user";
        }
    }

    @GetMapping("/user_list")
    public String showUserList(Model model) {
        List<User> userList = userService.list();
        model.addAttribute("userList", userList);
        return "user_list";
    }

    @GetMapping("/user_profile")
    public String userProfile(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            model.addAttribute("loggedInUser", loggedInUser);
        } else {
            return "redirect:/login";
        }
        return "user_profile";
    }

    @GetMapping("/add_characteristics")
    public String showAddCharacteristicsForm(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            model.addAttribute("characteristics", new PhysicalCharacteristics());
            model.addAttribute("genders", Gender.values());
            model.addAttribute("physicalGoals", PhysicalGoal.values());
            return "add_characteristics";
        } else {
            return "redirect:/login";
        }
    }

    @PostMapping("/add_characteristics")
    public String addCharacteristics(@ModelAttribute PhysicalCharacteristics characteristics, Model model, HttpSession session) throws Exception {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            loggedInUser.setCharacteristics(characteristics);
            userService.update(loggedInUser.getId(), loggedInUser);
            model.addAttribute("message", "Features added successfully!");
            return "redirect:/user_profile";
        } else {
            return "redirect:/login";
        }
    }

    @RequestMapping(value = "/manage_users", method = RequestMethod.POST)
    public String manageUser(@RequestParam("id") int id, @RequestParam("action") String action, Model model) {
        if ("delete_user".equals(action)) {
            userService.remove(id);
            model.addAttribute("message", "User deleted successfuly");
        } else if ("edit_user".equals(action)) {
            ////////////////////////////////
            userService.remove(id);
            model.addAttribute("message", "User deleted successfuly");
        }
            List<User> userList = userService.list();
            model.addAttribute("userList", userList);
            return "user_list";
        }
    }


