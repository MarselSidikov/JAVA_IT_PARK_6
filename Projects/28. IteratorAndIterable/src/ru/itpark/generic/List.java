package ru.itpark.generic;

public interface List<V> extends Iterable<V> {
    void addToBegin(V value);
    void addToEnd(V value);
    V get(int index);
    int size();
}
