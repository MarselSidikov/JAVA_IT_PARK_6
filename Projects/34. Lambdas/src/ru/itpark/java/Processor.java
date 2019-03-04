package ru.itpark.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Processor {
    public static <T, R> List<R> map(List<T> source, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T element : source) {
            R processed = function.apply(element);
            result.add(processed);
        }
        return result;
    }

    public static <T> List<T> filter(List<T> source, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T element : source) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static <T> void forEach(List<T> source, Consumer<T> consumer) {
        for (T element : source) {
            consumer.accept(element);
        }
    }
}
