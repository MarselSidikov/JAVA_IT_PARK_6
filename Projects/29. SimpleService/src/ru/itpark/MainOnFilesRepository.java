package ru.itpark;

import ru.itpark.repositories.UsersRepository;
import ru.itpark.repositories.files.UsersRepositoryFilesImpl;
import ru.itpark.repositories.files.IdGenerator;
import ru.itpark.utils.UserFromConsoleRetriever;

public class MainOnFilesRepository {

    public static void main(String[] args) {
        UserFromConsoleRetriever retriever = new UserFromConsoleRetriever();
        IdGenerator idGenerator = new IdGenerator("users_id_sequence.txt");
        UsersRepository usersRepository = new UsersRepositoryFilesImpl("users.txt", idGenerator);
//        User user = retriever.retrieveUser();
//        usersRepository.save(user);
        System.out.println(usersRepository.find(0L));
        System.out.println(usersRepository.find(1L));
        System.out.println(usersRepository.find(2L));
    }
}
