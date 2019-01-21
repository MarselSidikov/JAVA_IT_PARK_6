package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(1, 1, 1, 2, 3, 4);
        Sphere sphere = new Sphere(1, 1, 1, 10);
        Point point = new Point(1, 1, 1);

        Figure figures[] = {box, sphere, point};
        Scalable scalables[] = {box, sphere};

        SpaceOperations.moveAll(figures, 2, 2, 2);
        SpaceOperations.scaleAll(scalables, 5);
    }
}
