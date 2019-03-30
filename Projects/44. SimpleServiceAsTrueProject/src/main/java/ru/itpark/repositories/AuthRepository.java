package ru.itpark.repositories;

import ru.itpark.models.Auth;

import java.util.Optional;

public interface AuthRepository extends CrudRepository<Auth> {
    Optional<Auth> findByValue(String value);
}
