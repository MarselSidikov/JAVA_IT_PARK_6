package ru.itpark;

public class Box extends Figure implements Scalable {


    private double height;
    private double length;
    private double width;

    public Box(double x, double y, double z, double height, double length, double width) {
        super(x, y, z);
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void scale(double value) {
        this.height *= value;
        this.length *= value;
        this.width *= value;
    }
}
