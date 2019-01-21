package ru.itpark;

public abstract class Figure {
    private double x;
    private double y;
    private double z;

    public Figure(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void move(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
