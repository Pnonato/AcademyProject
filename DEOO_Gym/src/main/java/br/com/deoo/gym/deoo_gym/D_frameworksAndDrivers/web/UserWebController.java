package br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.web;

import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.C_interfaceAdaptors.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserWebController {

    private final UserDAO userDAO;

    @Autowired
    public UserWebController(UserDAO userDAO) {
        this.userDAO = userDAO;
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
            model.addAttribute("message", "cadastro concluido!!");
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



}
