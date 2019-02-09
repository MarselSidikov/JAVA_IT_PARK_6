package ru.itpark.extended.repositories;

import ru.itpark.extended.models.User;

public interface UsersRepository extends CrudRepository<User> {
    User findByName(String name);
}
