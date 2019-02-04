package ru.itpark;

public class MainObjectArrayList {

    public static void main(String[] args) {
	    ObjectArrayList integerList = new ObjectArrayList();

	    integerList.add(1);
	    integerList.add("Hello");
	    integerList.add(2);
	    integerList.add(3);
	    integerList.add(4);

	    ObjectArrayList stringList = new ObjectArrayList();

	    stringList.add("Marsel");
	    stringList.add("Hello");
	    stringList.add("Happy Birthday");

	    int valueFromIntegerList = (int)integerList.get(2);
		System.out.println(valueFromIntegerList);

		String valueFromStringList = (String)stringList.get(2);
		System.out.println(valueFromStringList);

		valueFromIntegerList = (int)integerList.get(1);
        System.out.println(valueFromIntegerList);
    }
}
