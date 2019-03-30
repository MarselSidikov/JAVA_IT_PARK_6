package ru.itpark.services;

import ru.itpark.models.User;

import javax.servlet.http.Cookie;
import java.util.Optional;

public interface AuthService {
    Optional<User> findUserByCookie(Cookie cookie);
}
