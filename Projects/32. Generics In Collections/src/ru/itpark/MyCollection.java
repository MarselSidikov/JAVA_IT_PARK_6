package ru.itpark;

public interface MyCollection<C> extends MyIterable<C> {
    void addFirst(C element);
}
