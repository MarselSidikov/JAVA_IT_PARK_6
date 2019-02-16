package ru.itpark.generic;

import java.util.Iterator;

public class Main {

    public static <T> void printAllElements(List<T> elements) {
        for (T current : elements) {
            System.out.println(current);
        }
    }
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.addToEnd(1);
        integerList.addToEnd(2);
        integerList.addToEnd(3);
        integerList.addToEnd(4);
        integerList.addToEnd(5);

        Iterator<Integer> integerIterator = integerList.iterator();

//        while (integerIterator.hasNext()) {
//            System.out.println(integerIterator.next());
//        }

        printAllElements(integerList);
        int value = integerList.get(2);

    }
}
