package ru.itpark.repositories;

import ru.itpark.models.User;
import ru.itpark.utils.IdGenerator;

import java.io.*;

public class UsersRepositoryImpl implements UsersRepository {

    private String fileName;
    private IdGenerator idGenerator;

    public UsersRepositoryImpl(String fileName, IdGenerator idGenerator) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }

    @Override
    public void save(User model) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            int id = idGenerator.generateId();
            model.setId(id);
            writer.write(model.getId() + " " + model.getFirstName() + " " + model.getLastName() + " " + model.getLogin() + " " + model.getPassword());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public User find(int id) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String userData[] = currentLine.split(" ");
                int currentId = Integer.parseInt(userData[0]);
                if (currentId == id) {
                    User user = new User(userData[1], userData[2], userData[3], userData[4]);
                    user.setId(currentId);
                    return user;
                }
                currentLine = reader.readLine();
            }
            return null;
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
