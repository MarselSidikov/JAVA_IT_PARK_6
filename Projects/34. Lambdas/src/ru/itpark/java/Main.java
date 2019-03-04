package ru.itpark.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Марсель");
        strings.add("Рафаэлевич");
        strings.add("Сидиков");
        strings.add("25");
        strings.add("Программист");

        List<Integer> integers = Processor.map(strings, word -> word.length());

        for (Integer length : integers) {
            System.out.println(length);
        }

        System.out.println("---------");

        List<String> filtered = Processor.filter(strings, word -> word.length() > 7);

        for (String string : filtered) {
            System.out.println(string);
        }

        System.out.println("---------");
        Processor.forEach(strings, word -> System.err.println(word));
    }
}
