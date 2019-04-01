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

    @Autowired
    private AuthRepository authRepository;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public void signUp(AuthUserForm form) {
        String passwordHash = encoder.encode(form.getPassword());

        User newUser = User.builder()
                .login(form.getLogin())
                .passwordHash(passwordHash)
                .build();

        usersRepository.save(newUser);
    }

    @Override
    public Optional<String> signInAndCreateCookieValue(AuthUserForm form) {
        Optional<User> userCandidate = usersRepository.findOneByLogin(form.getLogin());
        if (userCandidate.isPresent()) {
            User user = userCandidate.get();
            if (encoder.matches(form.getPassword(), user.getPasswordHash())) {
                String value = UUID.randomUUID().toString();
                Auth auth = Auth.builder()
                        .user(user)
                        .value(value)
                        .build();
                authRepository.save(auth);
                return Optional.of(value);
            }
        }
        return Optional.empty();
    }

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
