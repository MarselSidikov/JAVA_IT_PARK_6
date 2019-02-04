package ru.itpark;

public class ObjectArrayList {
    private Object elements[];
    private int count;

    public ObjectArrayList() {
        this.elements = new Object[10];
        this.count = 0;
    }

    public void add(Object value) {
        this.elements[count] = value;
        count++;
    }

    public Object get(int index) {
        if (index < count && index >= 0) {
            return elements[index];
        }
        throw new IndexOutOfBoundsException();
    }
}
