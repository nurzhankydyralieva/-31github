package org.password_create.project.storage;

import com.epam.project.model.User;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class Storage {
    private Map<String, User> users = new HashMap<>();

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public void writeDataToUserStorageFile(Map<Integer, User> users) {
        try (FileWriter writer = new FileWriter("data_user.txt")) {
            for (Map.Entry<Integer, User> entry : users.entrySet()) {
                User user = entry.getValue();
                writer.write(user.getId() + ", " + user.getFirstName() + ", " + user.getLastName() + ", " + user.getUserName() + ", " + user.getPassword() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initBean() {
        System.out.println("Init Bean for : Storage");
    }

    public void destroyBean() {
        System.out.println("Destroy Bean for : Storage");
    }
}
