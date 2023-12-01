package org.crud_example.example;

import org.crud_example.example.model.Trainer;
import org.crud_example.example.config.AppConfig;
import org.crud_example.example.service.TrainerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TrainerMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(TrainerMain.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TrainerService traineeService = context.getBean("trainerService", TrainerService.class);
     //   LOGGER.info("Trainer is created");
        Trainer saved = Trainer.builder().id(4L).name("Andrea").build();
        System.out.println(traineeService.createOrUpdateTrainer(saved));

        Trainer updated = Trainer.builder().id(4L).name("Jackson").build();
        System.out.println("\nTrainer updated\n" + traineeService.createOrUpdateTrainer(updated));

        traineeService.getAllTrainers().forEach(System.out::println);
        System.out.println("\nFind trainee by id\n" + traineeService.getTrainerByID(4L));
    }
}
