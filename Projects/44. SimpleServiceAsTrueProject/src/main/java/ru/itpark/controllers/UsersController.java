package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.itpark.forms.UserForm;
import ru.itpark.models.User;
import ru.itpark.services.UsersService;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public ModelAndView getUsersPage() {
        List<User> allUsers = usersService.getAllUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users", allUsers);
        modelAndView.setViewName("users_page");
        return modelAndView;
    }

    @PostMapping("/users")
    public String addNewUser(UserForm form) {
        usersService.addUser(form);
        return "redirect:/users";
    }
}
