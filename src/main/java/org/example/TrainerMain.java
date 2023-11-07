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
        System.out.println("--------------------------------------");

        Trainer trainer = new Trainer();
        trainer.setId(3L);
        trainer.setName("Andrea");
        Trainer newUser = traineeService.createOrUpdateTrainer(trainer);
        System.out.println("Trainer saved: " + newUser);
        traineeService.getAllTrainers().forEach(System.out::println);

    }
}
