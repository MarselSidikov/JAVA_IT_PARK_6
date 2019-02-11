package ru.itpark;

import ru.itpark.models.User;
import ru.itpark.repositories.UsersRepository;
import ru.itpark.repositories.UsersRepositoryImpl;
import ru.itpark.utils.IdGenerator;
import ru.itpark.utils.UserFromConsoleRetriever;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserFromConsoleRetriever retriever = new UserFromConsoleRetriever();
        IdGenerator idGenerator = new IdGenerator("users_id_sequence.txt");
        UsersRepository usersRepository = new UsersRepositoryImpl("users.txt", idGenerator);
//        User user = retriever.retrieveUser();
//        usersRepository.save(user);
        System.out.println(usersRepository.find(0));
        System.out.println(usersRepository.find(1));
        System.out.println(usersRepository.find(2));
    }
}
