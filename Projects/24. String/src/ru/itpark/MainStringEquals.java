package ru.itpark;

public class MainStringEquals {
    public static void main(String[] args) {
        String s1 = "Marsel";
        String s2 = "Marsel";
        System.out.println(s1 == s2);

        String s3 = new String("Marsel");
        String s4 = new String("Marsel");
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s4));

        System.out.println(s1.intern() == s4.intern());
    }
}
