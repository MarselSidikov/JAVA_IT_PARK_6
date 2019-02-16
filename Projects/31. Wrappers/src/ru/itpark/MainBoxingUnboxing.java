package ru.itpark;

public class MainBoxingUnboxing {

    public static void main(String[] args) {
        // boxing, упаковка
        // упаковали 10-ку в объект типа Integer
        Integer i1 = new Integer(10);
        // unboxing, распаковка
        // забрали у объекта типа Integer
        // значение 10
        int i1Value = i1.intValue();

        // autoboxing - автоупаковка
        Integer i2 = 10;
        // autounboxing - автораспаковка
        i1Value = i2;

    }
}
