package ru.itpark.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itpark.app.models.User;
import ru.itpark.app.repositories.UsersRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users")
    public String getUsersPage(ModelMap model) {
        List<User> users = usersRepository.findAllByOrderByAgeDesc();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/users/search")
    public String getSearchPage() {
        return "users_search";
    }

    @GetMapping("/search")
    @ResponseBody
    public List<User> getUsersByKeyword(@RequestParam("q") String query) {
        return usersRepository.findAllByFirstNameContainsIgnoreCaseOrLastNameContainsIgnoreCase(query, query);
    }
}
