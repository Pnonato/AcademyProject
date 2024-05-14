package br.com.deoo.gym.deoo_gym.D_frameworksAndDrivers.web;

import br.com.deoo.gym.deoo_gym.A_entity.User;
import br.com.deoo.gym.deoo_gym.B_useCases.Login;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginWebController {

    private final Login loginUseCase;

    public LoginWebController(Login loginUseCase) {
        this.loginUseCase = loginUseCase;
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam("email") String email,
                            @RequestParam("password") String password,
                            HttpSession session,
                            Model model) {
        User user = loginUseCase.authenticateUser(email, password);
        if (user != null) {
            session.setAttribute("loggedInUser", user);
            model.addAttribute("message", "Login Feito!!");
            return "redirect:/user_profile";
        } else {
            model.addAttribute("error", "Email ou senha inválidos :c ");
            return "login";
        }
    }




}

