package ru.itpark.repositories;

import ru.itpark.models.User;

import java.util.List;

public interface UsersRepository extends CrudRepository<User> {
    User findOneByLogin(String login);
    List<User> findAllByFirstNameAndLastName(String firstName, String lastName);
}
