package ru.itpark;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double x, double y, double a, double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double calcArea() {
        return 0;
    }
}
