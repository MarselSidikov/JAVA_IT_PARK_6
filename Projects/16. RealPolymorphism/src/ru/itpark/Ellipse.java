package ru.itpark;

public class Ellipse extends Shape {
    private double radius1;
    private double radius2;

    public Ellipse(double x, double y, double radius1, double radius2) {
        super(x, y);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * Math.sqrt((radius1 * radius1 + radius2 * radius2) / 2);
    }

    @Override
    public double calcArea() {
        return 0;
    }
}
