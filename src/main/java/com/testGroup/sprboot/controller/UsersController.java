package com.testGroup.sprboot.controller;

import com.testGroup.sprboot.model.User;
import com.testGroup.sprboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String findAll(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }

    @GetMapping("/user-create")
    public String createUserForm(User user, Model model){

        model.addAttribute("user", user);
        return "user-create";
    }

    @PutMapping("/user-create")
    public String createUser(User user){

        userService.saveUser(user);
        return "redirect:/users";
    }

    @DeleteMapping("/user-delete")
    public String deleteUser(@RequestParam(value = "id")  Long id){
        userService.deleteById(id);
        return "redirect:/users";
    }

    @GetMapping("/user-update")
    public String updateUserForm(@RequestParam(value = "id") Long id, Model model){
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "user-update";
    }

    @PutMapping("/user-update")
    public String updateUser(User user){
        userService.saveUser(user);
        return "redirect:/users";
    }
}
