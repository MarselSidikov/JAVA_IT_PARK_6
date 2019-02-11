package ru.itpark.repositories;

// CREATE, READ, UPDATE, DELETE
public interface CrudRepository<T> {
    void save(T model);
    T find(int id);
}
