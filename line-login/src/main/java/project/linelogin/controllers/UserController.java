package project.linelogin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import project.linelogin.repositories.UserRepository;
import project.linelogin.services.UserService;


@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;

    @Qualifier("userRepository")
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public Object getUser() {
        return userService.getUserByUsername("mildTN");
    }

    @PostMapping("/registrant")
    public String registrant() {
        return "Login";
    }

    @PostMapping("/login")
    public String login() {
        return "Login";
    }
}
