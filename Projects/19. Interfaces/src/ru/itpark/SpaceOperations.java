package ru.itpark;

public class SpaceOperations {

    public static void moveAll(Figure figures[], double x, double y, double z) {
        for (int i = 0; i < figures.length; i++) {
            figures[i].move(x, y, z);
        }
    }

    public static void scaleAll(Scalable scalables[], double value) {
        for (int i = 0; i < scalables.length; i++) {
            scalables[i].scale(value);
        }
    }
}
