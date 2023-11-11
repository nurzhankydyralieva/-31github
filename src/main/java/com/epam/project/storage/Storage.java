package com.epam.project.storage;

import com.epam.project.model.Trainee;
import com.epam.project.model.Trainer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Storage {
    private Map<Integer, Trainer> trainers = new HashMap<>();
    private Map<Integer, Trainee> trainees = new HashMap<>();

    public Map<Integer, Trainee> getTrainees() {
        return trainees;
    }

    public Map<Integer, Trainer> getTrainers() {
        return trainers;
    }


    public void setTrainers(Map<Integer, Trainer> trainers) {
        this.trainers = trainers;
    }
    public void setTrainees(Map<Integer,Trainee> trainees){
        this.trainees=trainees;
    }
}