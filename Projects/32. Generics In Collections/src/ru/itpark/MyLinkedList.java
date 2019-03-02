package ru.itpark;

import java.util.Collection;

public class MyLinkedList<D> implements MyCollection<D> {

    private Node<D> first;

    private class LinkedListIterator implements MyIterator<D> {

        private Node<D> current;

        private LinkedListIterator() {
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public D next() {
            D value = current.value;
            current = current.next;
            return value;
        }
    }

    private static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public void addFirst(D element) {
        Node<D> newNode = new Node<>(element);
        if (first == null) {
            this.first = newNode;
        } else {
            newNode.next = this.first;
            this.first = newNode;
        }
    }



    @Override
    public MyIterator<D> iterator() {
        return new LinkedListIterator();
    }
}
