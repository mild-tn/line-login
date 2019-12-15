package project.linelogin.controllers;

import project.linelogin.models.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
public class UserController {

    @GetMapping("/user")
    public String getUser() {
        UserModel userModel = new UserModel("mild","908800",78086679);
        return userModel.getUsername() + userModel.getPassword();
    }
}
