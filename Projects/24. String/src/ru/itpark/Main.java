package ru.itpark;

public class Main {

    public static void main(String[] args) {
	    String name = "Marsel";
	    String secondName = name;
	    String replaced = name.replace('M', 'H');
        System.out.println(name);
        System.out.println(replaced);
        name = replaced;
        System.out.println(secondName);
    }
}
