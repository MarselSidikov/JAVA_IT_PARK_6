package ru.itpark.generic;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {

    private Node<T> top;
    private Node<T> tail;
    private int count;

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {

        Node<T> current;

        LinkedListIterator() {
            this.current = top;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T value = current.value;
            current = current.next;
            return value;
        }
    }

    private static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }

    public void addToBegin(T value) {
        Node<T> node = new Node<>(value);

        if (top == null) {
            tail = node;
        }

        node.next = top;
        count++;
        top = node;
    }

    public void addToEnd(T value) {
        Node<T> node = new Node<T>(value);

        if (top == null) {
            top = node;
            tail = top;
        } else {
            tail.next = node;
            tail = node;
        }
        count++;
    }

    public T get(int index) {
        Node<T> current = top;
        int i = 0;
        if (index < count) {
            while (i < index) {
                current = current.next;
                i++;
            }
            return current.value;
        } else throw new IllegalArgumentException();
    }

    public int size() {
        return count;
    }
}
