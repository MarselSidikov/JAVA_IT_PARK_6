package ru.itpark.example;

import java.util.ArrayList;
import java.util.List;

public class TextProcessor {
    public static List<String> process(List<String> strings, StringFunction function) {
        List<String> result = new ArrayList<>();

        for (String source : strings) {
            String processed = function.apply(source);
            result.add(processed);
        }

        return result;

    }

}
