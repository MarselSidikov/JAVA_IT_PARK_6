package ru.itpark.services;

import ru.itpark.forms.AuthUserForm;
import ru.itpark.forms.UserForm;
import ru.itpark.models.User;

import java.util.List;
import java.util.Optional;

public interface UsersService {
    List<User> getAllUsers();
    void addUser(UserForm form);
}
