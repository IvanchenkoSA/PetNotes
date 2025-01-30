package ru.isa.petnotes.controller;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.isa.petnotes.model.User;
import ru.isa.petnotes.service.UserService;

@Controller
@AllArgsConstructor
public class AuthController {

    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login.html"; // Имя вашего шаблона для страницы входа
    }

    @GetMapping("/")
    public String home() {
        return "index.html"; // Имя вашего шаблона для главной страницы
    }

//    @GetMapping("/register")
//    public String showRegistrationForm(Model model) {
//        model.addAttribute("user", new User());
//        return "register"; // имя вашего шаблона для регистрации
//    }

    @GetMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        userService.registerUser(user);
        return "redirect:/login"; // перенаправление на страницу входа после успешной регистрации
    }

}
