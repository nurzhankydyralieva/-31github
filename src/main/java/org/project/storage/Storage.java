package org.project.storage;

import com.epam.project.model.Trainee;
import com.epam.project.model.Trainer;
import com.epam.project.model.Training;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class Storage {
    @Value("${data.file.path.trainer}")
    private String dataFilePath;
    private Map<Integer, Trainer> trainers = new HashMap<>();

    public Map<Integer, Trainer> getTrainers() {
        return trainers;
    }

    public void writeDataToTrainerFile(Map<Integer, Trainer> trainers) {
        try (FileWriter writer = new FileWriter("data_trainer.txt")) {
            for (Map.Entry<Integer, Trainer> entry : trainers.entrySet()) {
                Trainer trainer = entry.getValue();
                writer.write(trainer.getId() + "," + trainer.getName() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void initBean() {
        System.out.println("Init Bean for : Storage");
    }


    public void destroyBean() {
        System.out.println("Destroy Bean for : Storage");
    }

    private Map<Integer, Trainee> trainees = new HashMap<>();
    private Map<Integer, Training> trainings = new HashMap<>();

    public Map<Integer, Trainee> getTrainees() {
        return trainees;
    }

    public Map<Integer, Training> getTrainings() {
        return trainings;
    }

    public void setTrainers(Map<Integer, Trainer> trainers) {
        this.trainers = trainers;
    }

    public void setTrainees(Map<Integer, Trainee> trainees) {
        this.trainees = trainees;
    }

    public void setTrainings(Map<Integer, Training> trainings) {
        this.trainings = trainings;
    }
}
