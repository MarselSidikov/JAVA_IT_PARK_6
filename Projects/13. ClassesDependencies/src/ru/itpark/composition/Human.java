package ru.itpark.composition;

public class Human {
    private String name;
    private Brain brain;

    public Human(String name) {
        this.name = name;
        this.brain = new Brain();
    }

    public void speak() {
        this.brain.think();
    }
}
