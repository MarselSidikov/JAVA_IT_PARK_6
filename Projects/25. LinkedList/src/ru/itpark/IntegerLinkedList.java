package ru.itpark;

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
}
