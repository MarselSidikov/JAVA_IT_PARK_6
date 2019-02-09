package ru.itpark;

import java.util.Comparator;

public class Algorithms {

    public static <T extends Comparable<T>> void sort(ArrayList<T> list) {
        sort0(list, null);
    }

    public static <T> void sort(ArrayList<T> list, Comparator<T> comparator) {
        sort0(list, comparator);
    }

    private static <T> void sort0(ArrayList<T> list, Comparator<T> comparator) {
        int N = list.count;
        Object elements[] = list.elements;
        // бежим по элементам с конца в начало
        for (int i = N - 1; i >= 0; i--) {
            // для каждого шага i пробегаем все элементы
            // от начала до i
            for (int j = 0; j < i; j++) {
                // сравниваем объект
                // elements[j] с объектом elements[j+1]
                int compareResult = 0;
                if (comparator == null) {
                    compareResult = ((Comparable<T>)elements[j]).compareTo((T)elements[j+1]);
                } else {
                    compareResult = comparator.compare((T)elements[j], (T)elements[j+1]);
                }
                if (compareResult > 0) {
                    T temp = (T)elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                }
            }
        }
    }

//    public static <T extends Comparable<T>> void sort(ArrayList<T> list) {
//        int N = list.count;
//        Object elements[] = list.elements;
//        // бежим по элементам с конца в начало
//        for (int i = N - 1; i >= 0; i--) {
//            // для каждого шага i пробегаем все элементы
//            // от начала до i
//            for (int j = 0; j < i; j++) {
//                // сравниваем объект
//                // elements[j] с объектом elements[j+1]
//                if (((Comparable<T>)elements[j]).compareTo((T)elements[j+1]) > 0) {
//                    T temp = (T)elements[j];
//                    elements[j] = elements[j+1];
//                    elements[j+1] = temp;
//                }
//            }
//        }
//    }
//
//    public static <T> void sort(ArrayList<T> list, Comparator<T> comparator) {
//        int N = list.count;
//        Object elements[] = list.elements;
//        // бежим по элементам с конца в начало
//        for (int i = N - 1; i >= 0; i--) {
//            // для каждого шага i пробегаем все элементы
//            // от начала до i
//            for (int j = 0; j < i; j++) {
//                // сравниваем объект
//                // elements[j] с объектом elements[j+1]
//                if (comparator.compare((T)elements[j], (T)elements[j+1]) > 0) {
//                    T temp = (T)elements[j];
//                    elements[j] = elements[j+1];
//                    elements[j+1] = temp;
//                }
//            }
//        }
//    }
}
