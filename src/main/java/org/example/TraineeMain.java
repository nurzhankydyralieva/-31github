package org.example;

import org.example.config.AppConfig;
import org.example.model.Trainee;
import org.example.model.User;
import org.example.service.TraineeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;

public class TraineeMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(TraineeMain.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TraineeService traineeService = context.getBean("traineeService", TraineeService.class);
        Trainee created = Trainee.builder().id(3L).address("London").dateOfBirth(Calendar.getInstance().getTime()).userId(User.builder().id(2L).build()).build();
        LOGGER.info("Trainee is created");
        Trainee newTrainee = traineeService.createOrUpdateTrainee(created);
        System.out.println(newTrainee);

        traineeService.getAllTrainees().forEach(System.out::println);
        System.out.println(traineeService.getTraineeById(3L));

        Trainee updated = Trainee.builder().id(4L).address("Russia").dateOfBirth(Calendar.getInstance().getTime()).userId(User.builder().id(2L).build()).build();
        System.out.println("\nUpdated Trainee\n" + updated);

        traineeService.deleteTrainee(1L);
        System.out.println("\nAfter deleted trainees in database");
        traineeService.getAllTrainees().forEach(System.out::println);
    }
}
