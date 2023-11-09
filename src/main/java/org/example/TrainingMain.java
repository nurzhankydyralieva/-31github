package org.example;

import org.example.config.AppConfig;
import org.example.model.Training;
import org.example.service.TrainingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TrainingMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TrainingService trainingService = context.getBean("trainingService", TrainingService.class);
        trainingService.getAllTraining().forEach(System.out::println);

        Training created = Training.builder().build();
        System.out.println("\nTrainer saved\n" + trainingService.createTraining(created));

        System.out.println("\nFind trainee by id\n" + trainingService.getTrainingByID(1L));
    }
}
