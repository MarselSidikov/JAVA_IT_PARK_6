package ru.itpark;

public class Human {
    public double height;
    public String name;
    private boolean isMan;

    public Human() {
        this.height = 10;
    }

    public Human(double height) {
        this.height = height;
    }

    public double grow(double value) {
        this.height += value;
        return this.height;
    }

    public void changeSex() {
        this.isMan = !isMan;
    }

    public boolean isMan() {
        return isMan;
    }
}
