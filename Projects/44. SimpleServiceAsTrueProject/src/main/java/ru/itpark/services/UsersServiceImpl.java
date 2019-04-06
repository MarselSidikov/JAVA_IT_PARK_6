package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.itpark.forms.AuthUserForm;
import ru.itpark.forms.UserForm;
import ru.itpark.models.Auth;
import ru.itpark.models.User;
import ru.itpark.repositories.AuthRepository;
import ru.itpark.repositories.UsersRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public void addUser(UserForm form) {
        User user = User.builder()
                .lastName(form.getLastName())
                .firstName(form.getFirstName())
                .build();

        usersRepository.save(user);
    }
}
