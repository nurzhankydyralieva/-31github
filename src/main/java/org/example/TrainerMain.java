package org.example;

import org.example.config.AppConfig;
import org.example.model.Trainer;
import org.example.service.TrainerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TrainerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TrainerService traineeService = context.getBean("trainerService", TrainerService.class);
        System.out.println("All trainers");
        traineeService.getAllTrainers().forEach(System.out::println);

        Trainer saved = Trainer.builder().id(4L).name("Andrea").build();
        System.out.println("\nTrainer saved\n" + traineeService.createOrUpdateTrainer(saved));

        Trainer updated = Trainer.builder().id(4L).name("Jackson").build();
        System.out.println("\nTrainer updated\n" + traineeService.createOrUpdateTrainer(updated));

        System.out.println("\nFind trainee by id\n" + traineeService.getTrainerByID(1L));
    }
}
