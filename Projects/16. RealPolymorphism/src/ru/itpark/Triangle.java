package ru.itpark;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double x, double y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcPerimeter() {
        return a + b + c;
    }

    public double calcPerimeter(int x) {
        return a + b + c;
    }

    @Override
    public double calcArea() {
        return 0;
    }

}
