package ru.itpark;

import java.util.Random;

public class SomeClass {

    static final int SOME_CONSTANT = 100;

    int field;

    static int staticField = 777;

    static {
        System.out.println("Invocation in static-initializator");
        Random random = new Random();
        staticField = random.nextInt(10000);
    }

    void objectMethodForIncrementStaticField() {
        staticField++;
    }

    static void staticMethodForIncrementStaticField() {
        staticField++;
    }

//    static void staticMethodForIncrementField() {
//        field++;
//    }
}
