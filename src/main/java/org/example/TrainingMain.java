package org.example;

import org.example.config.AppConfig;
import org.example.model.Training;
import org.example.service.TrainingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TrainingMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(TrainingMain.class);
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TrainingService trainingService = context.getBean("trainingService", TrainingService.class);
        trainingService.getAllTraining().forEach(System.out::println);
        LOGGER.info("Training is created");
        Training created = Training.builder().build();
        System.out.println(trainingService.createTraining(created));

        System.out.println("\nFind trainee by id\n" + trainingService.getTrainingByID(1L));
    }
}
