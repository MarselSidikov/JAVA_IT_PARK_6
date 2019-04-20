package ru.itpark.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.app.models.User;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findAllByOrderByAge();
    List<User> findAllByOrderByAgeDesc();
    List<User> findAllByOrderById();
    List<User> findAllByOrderByIdDesc();
    List<User> findAllByFirstNameContainsIgnoreCaseOrLastNameContainsIgnoreCase(String keyword1, String keyword2);
}
