package ru.itpark.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	    StringFunction function = new ToUpperFunction();

//        StringFunction function = new StringFunction() {
//            @Override
//            public String apply(String source) {
//                return source.toLowerCase();
//            }
//        };

//        StringFunction function = source -> source.replaceAll("а", "о");

        List<String> strings = new ArrayList<>();

        strings.add("Марсель");
        strings.add("Рафаэлевич");
        strings.add("Сидиков");
        strings.add("25");
        strings.add("Программист");

//        List<String> processed = processor.map(strings, function);
//        List<String> processed = processor.map(strings,
//                source -> source.replaceAll("a", "о"));

        List<String> processed = TextProcessor.process(strings, source -> {
           char sourceAsChar[] = source.toCharArray();
           for (int i = 0; i < source.length() / 2; i++) {
               char temp = sourceAsChar[i];
               sourceAsChar[i] = sourceAsChar[source.length() - 1 - i];
               sourceAsChar[source.length() - 1 - i] = temp;
           }

           return String.valueOf(sourceAsChar);
        });

        for (String upperWord : processed) {
            System.out.println(upperWord);
        }
    }
}
