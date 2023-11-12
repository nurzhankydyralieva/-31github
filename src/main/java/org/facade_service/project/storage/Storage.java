package org.facade_service.project.storage;


import org.facade_service.project.model.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Storage {
    private Map<Integer, Trainer> trainers = new HashMap<>();
    private Map<Integer, Trainee> trainees = new HashMap<>();
    private Map<Integer, Training> trainings = new HashMap<>();

    public Map<Integer, Trainee> getTrainees() {
        return trainees;
    }

    public Map<Integer, Trainer> getTrainers() {
        return trainers;
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