package ru.itpark;

public class Main {

    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        list.addToBegin(1);
        list.addToBegin(2);
        list.addToBegin(3);
        list.addToBegin(4);
        list.addToBegin(5);

        list.addToEnd(6);
        list.addToEnd(7);
        list.addToEnd(8);
        list.addToEnd(9);
        list.addToEnd(10);


        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
