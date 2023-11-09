package org.example;

import org.example.config.AppConfig;
import org.example.model.User;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);


        User user = userService.createUserPassword("Tom","Oliver");
        System.out.println("Username: " + user.getUserName());
        System.out.println("Password: " + user.getPassword());
    }
}
