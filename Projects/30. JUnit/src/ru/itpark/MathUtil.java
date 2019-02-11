package ru.itpark;

public class MathUtil {
    public boolean isPrime(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Not correct number");
        }

        if (number == 2 || number == 3) {
            return true;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
