package ru.itpark;

public class Main {

    public static void main(String[] args) {
	    User user = User.builder()
                .firstName("Марсель")
                .age(25)
                .lastName("Сидиков")
                .build();

        System.out.println(user);
    }
}
