package org.example;

import org.example.config.AppConfig;
import org.example.model.Trainee;
import org.example.model.User;
import org.example.service.TraineeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;

public class TraineeMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TraineeService traineeService = context.getBean("traineeService", TraineeService.class);
        System.out.println("All trainees in database");
        traineeService.getAllTrainees().forEach(System.out::println);

        System.out.println("\nFind trainee by id\n" + traineeService.getTraineeById(1L));

        Trainee saved = Trainee.builder().id(4L).address("Kyrgyzstan").dateOfBirth(Calendar.getInstance().getTime()).userId(User.builder().id(1L).build()).build();
        traineeService.createOrUpdateTrainee(saved);
        System.out.println("\nSaved Trainee\n" + saved);

        Trainee updated = Trainee.builder().id(4L).address("Russia").dateOfBirth(Calendar.getInstance().getTime()).userId(User.builder().id(2L).build()).build();
        System.out.println("\nUpdated Trainee\n" + updated);

        traineeService.deleteTrainee(1L);
        System.out.println("\nAfter deleted trainees in database");
        traineeService.getAllTrainees().forEach(System.out::println);
    }
}
