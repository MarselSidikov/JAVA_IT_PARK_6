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

import javax.servlet.http.Cookie;
import java.util.Optional;
import java.util.UUID;

@Component
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthRepository authRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public Optional<User> findUserByCookie(Cookie cookie) {
        Optional<Auth> auth = authRepository.findByValue(cookie.getValue());
        return auth.map(Auth::getUser);
    }

    @Override
    public void signUp(UserForm form) {
        String passwordHash = encoder.encode(form.getPassword());

        User newUser = User.builder()
                .login(form.getLogin())
                .passwordHash(passwordHash)
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
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
}
