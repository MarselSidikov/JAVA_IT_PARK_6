package ru.itpark;

public class GenericArrayList<T> {
    private T elements[];
    private int count;

    public GenericArrayList() {
        this.elements = (T[])new Object[10];
        this.count = 0;
    }

    public void add(T value) {
        this.elements[count] = value;
        count++;
    }

    public T get(int index) {
        if (index < count && index >= 0) {
            return elements[index];
        }
        throw new IndexOutOfBoundsException();
    }
}
