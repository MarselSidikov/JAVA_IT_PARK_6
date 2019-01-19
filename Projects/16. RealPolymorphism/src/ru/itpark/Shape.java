package ru.itpark;

public abstract class Shape {

    private double x;
    private double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcPerimeter();

    public abstract double calcArea();
}
