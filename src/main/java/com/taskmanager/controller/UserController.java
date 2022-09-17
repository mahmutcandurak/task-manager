package com.taskmanager.controller;

import com.taskmanager.dto.UserDto;
import com.taskmanager.model.User;
import com.taskmanager.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author mahmutcandurak
 */

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("userlist",userService.gelAllUsers());
        return "user";
    }

    @GetMapping("/register")
    public String addNewUser(Model model) {
        User user = new User();
        model.addAttribute("user",user);
        return "new";
    }


    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") Long id, Model model ){
        UserDto userDto = userService.getUserById(id);
        model.addAttribute("user", userDto);
        return "update";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUserById(@PathVariable(value = "id") Long id) {
        userService.deleteUserById(id);
        return "redirect:/";
    }





}
