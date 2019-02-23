package ru.itpark.repositories.files;

import ru.itpark.models.User;
import ru.itpark.repositories.UsersRepository;
import ru.itpark.repositories.files.IdGenerator;

import java.io.*;

public class UsersRepositoryFilesImpl implements UsersRepository {

    private String fileName;
    private IdGenerator idGenerator;

    public UsersRepositoryFilesImpl(String fileName, IdGenerator idGenerator) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }

    @Override
    public void save(User model) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            Long id = idGenerator.generateId();
            model.setId(id);
            writer.write(model.getId() + " " + model.getFirstName() + " " + model.getLastName() + " " + model.getLogin() + " " + model.getPassword());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public User find(Long id) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String userData[] = currentLine.split(" ");
                Long currentId = Long.parseLong(userData[0]);
                if (currentId.equals(id)) {
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
