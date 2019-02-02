package ru.itpark;

public class MainFinally {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("1. IllegalArgument");
        } catch (IllegalArgumentException e) {
            try {
                throw new StackOverflowError("2. StackOverflow");
            } catch (StackOverflowError e1) {
                throw new IllegalStateException("3. IllegalState");
            }
        } finally {
            System.out.println("I'm here");
        }
    }
}
