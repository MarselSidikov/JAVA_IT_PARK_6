package ru.itpark;

public class IntegerArrayList {
    private int elements[];
    private int count;

    public IntegerArrayList() {
        this.elements = new int[10];
        this.count = 0;
    }

    public void add(int value) {
        this.elements[count] = value;
        count++;
    }

    public int get(int index) {
        if (index < count && index >= 0) {
            return elements[index];
        }
        throw new IndexOutOfBoundsException();
    }
}
