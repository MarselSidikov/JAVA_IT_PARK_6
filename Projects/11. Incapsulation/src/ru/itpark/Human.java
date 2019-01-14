package ru.itpark;

public class Human {
    private String name;
    private int age;
    private int km;

    Human(String name, int age) {
        this.name = name;
        setAge(age);
        this.km = 0;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getKm() {
        return km;
    }
}