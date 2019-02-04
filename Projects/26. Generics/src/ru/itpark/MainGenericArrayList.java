package ru.itpark;

public class MainGenericArrayList {
    public static void main(String[] args) {
        GenericArrayList<Integer> integerList = new GenericArrayList<>();
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        // integerList.add("Hello");

        GenericArrayList<String> stringList = new GenericArrayList<>();
        stringList.add("Marsel");
        stringList.add("Hello");
        stringList.add("Happy Birthday");
//        stringList.add(4);

        int integerValue = integerList.get(2);
        String stringValue = stringList.get(1);


    }
}
