package ru.itpark;

public class Main {

    public static void printIfEquals(Object a, Object b) {
        if (a.equals(b)) {
            System.out.println("Yes, they're equal");
        } else {
            System.out.println("Yes, they're not equal");
        }
    }

    public static void main(String[] args) {
	    Human marsel = new Human(25, 1.85);
	    Human anotherMarsel = new Human(25, 1.85);
	    String someString = "Marsel!!!";
        System.out.println(marsel == anotherMarsel);
        System.out.println(marsel.equals(anotherMarsel));
        System.out.println(marsel.equals(someString));
        System.out.println(marsel.equals(null));
        printIfEquals(marsel, anotherMarsel);
        System.out.println(marsel);
    }
}
