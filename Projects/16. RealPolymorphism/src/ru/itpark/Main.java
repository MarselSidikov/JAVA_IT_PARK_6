package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Shape ellipse = new Ellipse(1, 1, 10, 5);
        Shape circle = new Circle(1, 1, 10);
        Shape rectangle = new Rectangle(1, 1, 4, 3);
        Shape square = new Square(1, 1, 5);
        Shape triangle = new Triangle(1, 1, 2, 3, 4);

        Shape shapes[] = {ellipse, circle, rectangle, square, triangle};

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calcPerimeter());
        }

//        Shape shape = new Shape(5, 5);
    }
}
