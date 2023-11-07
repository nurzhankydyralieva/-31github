package org.example;

import org.example.config.AppConfig;
import org.example.service.TraineeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TraineeMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TraineeService traineeService = context.getBean("traineeService",TraineeService.class);
        System.out.println("All trainees in database");
        traineeService.getAllTrainees().forEach(System.out::println);
        System.out.println("Find trainee by id");
        System.out.println(traineeService.getTraineeById(1L));
    }
}
