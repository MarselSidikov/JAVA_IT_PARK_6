package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itpark.forms.AuthUserForm;
import ru.itpark.forms.UserForm;
import ru.itpark.services.AuthService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Controller
public class AuthController {

    @Autowired
    private AuthService service;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "sign_up";
    }

    @PostMapping("/signUp")
    public String signUp(UserForm userForm) {
        service.signUp(userForm);
        return "redirect:/signIn";
    }

    @PostMapping("/signIn")
    public String signIn(AuthUserForm authForm, HttpServletResponse response) {
        Optional<String> cookieValue = service.signInAndCreateCookieValue(authForm);
        if (cookieValue.isPresent()) {
            response.addCookie(new Cookie("CLIENT_ID", cookieValue.get()));
            return "redirect:/";
        } else {
            return "redirect:/signIn";
        }
    }

    @GetMapping("/signIn")
    public String getSignInPage() {
        return "sign_in";
    }
}
