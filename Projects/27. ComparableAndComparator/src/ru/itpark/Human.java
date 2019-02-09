package ru.itpark;

public class Human implements Comparable<Human> {
    private int age;
    private String name;
    private double height;

    public Human(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

//    @Override
//    public int compareTo(Human o) {
//        return this.age - o.age;
//    }

    @Override
    public int compareTo(Human o) {
        return Double.compare(this.height, o.height);
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.height;
    }
}
