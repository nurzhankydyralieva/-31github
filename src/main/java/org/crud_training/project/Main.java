package org.crud_training.project;


import org.crud_training.project.config.AppConfig;
import org.crud_training.project.model.*;
import org.crud_training.project.service.*;
import org.crud_training.project.storage.Storage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TrainerService trainerService = context.getBean(TrainerService.class);
        TraineeService traineeService = context.getBean(TraineeService.class);
        TrainingService trainingService = context.getBean(TrainingService.class);
        Storage storage = context.getBean(Storage.class);
        // This is Trainer entity
        Map<Integer, Trainer> trainers = new HashMap<>();
        trainers.put(1, new Trainer(1, "John Doe"));
        trainers.put(2, new Trainer(2, "Jane Smith"));
        trainers.put(3, new Trainer(3, "Maks Leo"));

//        trainerService.create(trainers);
//        trainerService.update(1, new Trainer(1, "Katy Perry"));
//        trainerService.select();

        Map<Integer, Trainer> trainers2 = storage.getTrainers();

        for (Map.Entry<Integer, Trainer> entry : trainers2.entrySet()) {
            Trainer trainer = entry.getValue();
            System.out.println("Trainer id: " + trainer.getId() + ", Trainer name: " + trainer.getName());
        }
        // This is Trainee entity
        Map<Integer, Trainee> trainees = new HashMap<>();
        trainees.put(1, new Trainee(1, "Kyrgyzstan"));
        trainees.put(2, new Trainee(2, "Berlin"));

//        traineeService.create(trainees);
//        traineeService.update(1, new Trainee(1, "Dubai"));
//        traineeService.select();
//        traineeService.delete(1);

        Map<Integer, Trainee> trainees2 = storage.getTrainees();

        for (Map.Entry<Integer, Trainee> entry : trainees2.entrySet()) {
            Trainee trainee = entry.getValue();
            System.out.println("Trainee id: " + trainee.getId() + ", " + trainee.getDateOfBirth() + ", Address: " + trainee.getAddress() + ", " + trainee.getUserId());
        }
        // This is Training entity
        Map<Integer, Training> trainings = new HashMap<>();
        trainings.put(1, new Training(1, "Dance"));

        trainingService.create(trainings);
        trainingService.select();

        Map<Integer, Training> trainings2 = storage.getTrainings();

        for (Map.Entry<Integer, Training> entry : trainings2.entrySet()) {
            Training training = entry.getValue();
            System.out.println("Training id: " + training.getId() + ", " + training.getTrainerId() + ", Training name: " + training.getTrainingName()
                    + ", Training date: " + training.getTrainingDate() + ", Training type: " + training.getTrainingTypeId() + ", Training duration: " + training.getTrainingDuration());
        }

        context.close();
    }
}
