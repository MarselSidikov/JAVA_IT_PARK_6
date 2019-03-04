package ru.itpark.example;

public class ToUpperFunction implements StringFunction {
    @Override
    public String apply(String source) {
        return source.toUpperCase();
    }
}
