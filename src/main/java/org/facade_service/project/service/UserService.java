package org.facade_service.project.service;

import org.example.model.User;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserService {
    private String generateRandomPassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder password = new StringBuilder(10);

        for (int i = 0; i < 10; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }

        return password.toString();
    }

    public String generateUsername(String firstName, String lastName) {
        String username = firstName + "." + lastName;
        int serialNumber = 1;

        while (isUsernameTaken(username)) {
            username = firstName + "." + lastName + "." + serialNumber;
            serialNumber++;
        }

        return username;
    }
    private boolean isUsernameTaken(String username) {

        return false;
    }

    public User createUserPassword(String firstName, String lastName) {
        String username = generateUsername(firstName, lastName);
        String password = generateRandomPassword();

        return new User(username, password);
    }
}

