package ru.itpark;

import java.util.Objects;

public class Human {
    private int age;
    private double height;

    public Human(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

//    @Override
//    public boolean equals(Object object) {
//        if (object == this) {
//            return true;
//        }
//        // instanseof - not good
//        if (object == null || object.getClass() != this.getClass()) {
//            return false;
//        }
//        Human that = (Human)object;
//        return this.age == that.age &&
//                this.height == that.height;
//    }

//    public boolean equals(Human that) {
//        return this.age == that.age &&
//                this.height == that.height;
//    }

//    @Override
//    public String toString() {
//        return this.age + " " + this.height;
//    }


    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                Double.compare(human.height, height) == 0;
    }
}
