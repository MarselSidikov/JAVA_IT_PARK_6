package ru.itpark.repositories;

import ru.itpark.models.Car;

import java.util.List;

public interface CarRepository extends CrudRepository<Car> {
    List<Car> findAllByOwnerId(Long id);
}
