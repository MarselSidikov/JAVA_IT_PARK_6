package ru.itpark.repositories;

import ru.itpark.models.User;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends CrudRepository<User> {
    Optional<User> findOneByLogin(String login);
    List<User> findAllByFirstNameAndLastName(String firstName, String lastName);
}
