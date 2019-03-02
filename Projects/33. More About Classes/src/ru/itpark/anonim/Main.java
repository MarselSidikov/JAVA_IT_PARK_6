package ru.itpark.anonim;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    TextProcessor processor = new TextProcessor() {
            @Override
            public List<String> toUpper(List<String> strings) {
                List<String> result = new ArrayList<>();
                for (String string : strings) {
                    result.add(string.toUpperCase());
                }
                return result;
            }

            @Override
            public List<Integer> getLengths(List<String> strings) {
                List<Integer> result = new ArrayList<>();
                for (String string : strings) {
                    result.add(string.length());
                }
                return result;
            }
        };

	    List<String> source = new ArrayList<>();
	    source.add("hello");
	    source.add("marsel");
	    source.add("bye");
	    source.add("wowow");

	    for (String upperString : processor.toUpper(source)) {
            System.out.println(upperString);
        }
    }
}
