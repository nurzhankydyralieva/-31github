package org.example.service;

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
        // Check if the username already exists, if so, add a serial number
        // You'll need to implement a method to check if the username exists in your database
        // For this example, let's assume you have a method called `isUsernameTaken(username)`
        int serialNumber = 1;

        while (isUsernameTaken(username)) {
            username = firstName + "." + lastName + "." + serialNumber;
            serialNumber++;
        }

        return username;
    }

    // Example method to check if the username already exists
    private boolean isUsernameTaken(String username) {
        // Implement your logic to check if the username exists in the database
        // Return true if it exists, false otherwise
        // This could be done by querying your database
        return false; // Placeholder, replace with actual logic
    }

    public User createUserPassword(String firstName, String lastName) {
        String username = generateUsername(firstName, lastName);
        String password = generateRandomPassword();

        return new User(username, password);
    }
}

