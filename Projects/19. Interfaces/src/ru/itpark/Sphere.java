package ru.itpark;

public class Sphere extends Figure implements Scalable {

    private double radius;

    public Sphere(double x, double y, double z, double radius) {
        super(x, y, z);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void scale(double value) {
        this.radius = this.radius * value;
    }
}
