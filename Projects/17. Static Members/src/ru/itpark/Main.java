package ru.itpark;

public class Main {

    public static void main(String[] args) {
        SomeClass aObject = new SomeClass();
        aObject.field = 10;

        System.out.println(aObject.staticField);

        aObject.staticField = 150;

        SomeClass bObject = new SomeClass();
        bObject.field = 15;
        bObject.staticField = 200;

        System.out.println(aObject.field);
        System.out.println(bObject.field);

        System.out.println(aObject.staticField);
        System.out.println(bObject.staticField);

        SomeClass.staticField = 500;

        aObject.objectMethodForIncrementStaticField();
        bObject.objectMethodForIncrementStaticField();
        System.out.println(SomeClass.staticField);

        SomeClass.staticMethodForIncrementStaticField();
        System.out.println(aObject.staticField);
    }
}
