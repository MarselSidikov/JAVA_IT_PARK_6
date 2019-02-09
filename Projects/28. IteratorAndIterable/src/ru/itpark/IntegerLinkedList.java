package ru.itpark;

import sun.awt.image.ImageWatched;

public class IntegerLinkedList {
    private Node top;
    private Node tail;
    private int count;

    public IntegerLinkedList() {
        this.top = null;
        this.count = 0;
    }

    public void addToBegin(int value) {
        Node node = new Node(value);

        if (top == null) {
            tail = node;
        }

        node.setNext(top);
        count++;
        top = node;
    }

    public void addToEnd(int value) {
        Node node = new Node(value);

        if (top == null) {
            top = node;
            tail = top;
        } else {
//            Node current = top;
//            while (current.getNext() != null) {
//                current = current.getNext();
//            }
//            current.setNext(node);
            tail.setNext(node);
            tail = node;
        }
        count++;
    }

    public int get(int index) {
        Node current = top;
        int i = 0;
        if (index < count) {
            while (i < index) {
                current = current.getNext();
                i++;
            }
            return current.getValue();
        } else throw new IllegalArgumentException();
    }

    public int getCount() {
        return count;
    }

    private class LinkedListIterator implements Iterator {
        Node current;

        public LinkedListIterator() {
            this.current = top;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public int next() {
            int value = current.getValue();
            current = current.getNext();
            return value;
        }
    }

    public Iterator iterator() {
        return new LinkedListIterator();
    }
}
