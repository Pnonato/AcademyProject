package br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.web;

import br.com.deoo.gym.deoo_gym.A_entity.PhysicalCharacteristics;
import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dao.UserDAO;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("loggedInUser")
public class UserWebController {

    private final UserDAO userDAO;

    @Autowired
    public UserWebController(UserDAO userDAO) {
        this.userDAO = userDAO;
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
    public String addUser(User user, Model model) {
        try {
            userDAO.insert(user);
            model.addAttribute("message", "Registration completed!!");
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "add_user";
    }

    @GetMapping("/user_list")
    public String showUserList(Model model) {
        List<User> userList = userDAO.getAllUsers();
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
    @GetMapping("/add_characteristcs")
    public String showAddCharacteristicsForm(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            model.addAttribute("characteristics", new PhysicalCharacteristics());
            return "add_characteristcs";
        } else {
            return "redirect:/login";
        }
    }

    @PostMapping("/add_characteristics")
    public String addCharacteristics(@ModelAttribute PhysicalCharacteristics characteristics, Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            loggedInUser.setCharacteristics(characteristics);
            userDAO.update(loggedInUser.getId(), loggedInUser);
            model.addAttribute("message", "Features added successfully!");
            return "redirect:/user_profile";
        } else {
            return "redirect:/login";
        }
    }



}
