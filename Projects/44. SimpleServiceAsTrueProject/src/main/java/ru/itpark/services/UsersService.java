package ru.itpark.services;

import ru.itpark.forms.AuthUserForm;
import ru.itpark.forms.UserForm;
import ru.itpark.models.User;

import java.util.List;
import java.util.Optional;

public interface UsersService {
    void signUp(AuthUserForm form);
    Optional<String> signInAndCreateCookieValue(AuthUserForm form);
    List<User> getAllUsers();
    void addUser(UserForm form);
}
