package ru.itpark.anonim;

import java.util.List;

public interface TextProcessor {
    List<String> toUpper(List<String> strings);

    List<Integer> getLengths(List<String> strings);
}
