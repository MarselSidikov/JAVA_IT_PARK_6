package ru.itpark.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import ru.itpark.forms.AuthUserForm;
import ru.itpark.models.User;
import ru.itpark.repositories.UsersRepository;

import java.util.Optional;
import java.util.UUID;

public class UsersServiceImpl implements UsersService {

    private UsersRepository usersRepository;
    private PasswordEncoder encoder;

    public UsersServiceImpl(UsersRepository usersRepository, PasswordEncoder encoder) {
        this.usersRepository = usersRepository;
        this.encoder = encoder;
    }

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
                return Optional.of(UUID.randomUUID().toString());
            }
        }
        return Optional.empty();
    }
}
