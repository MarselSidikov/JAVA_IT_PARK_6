package ru.itpark.services;

import ru.itpark.forms.AuthUserForm;
import ru.itpark.forms.UserForm;
import ru.itpark.models.User;

import javax.servlet.http.Cookie;
import java.util.Optional;

public interface AuthService {
    void signUp(UserForm form);
    Optional<String> signInAndCreateCookieValue(AuthUserForm form);
    Optional<User> findUserByCookie(Cookie cookie);
}
