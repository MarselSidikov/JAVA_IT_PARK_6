package ru.itpark;

public interface GenericList<V> {
    V get(int index);
    void add(V value);
}
