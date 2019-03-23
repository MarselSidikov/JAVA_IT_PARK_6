package ru.itpark.services;

import ru.itpark.forms.AuthUserForm;

import java.util.Optional;

public interface UsersService {
    void signUp(AuthUserForm form);
    Optional<String> signInAndCreateCookieValue(AuthUserForm form);
}
