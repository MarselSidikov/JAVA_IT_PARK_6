package ru.itis;

public class Human {
    int age;
    boolean isMan;
    int km;

    // конструктор с параметрами
    public Human(int age, boolean isMan) {
        this.age = age;
        this.isMan = isMan;
        this.km = 0;
    }

    // пустой конструктор
    public Human() {
        this.age = 1;
        this.isMan = true;
        this.km = 0;
    }

    void go(int km) {
        this.km += km;
    }
}
