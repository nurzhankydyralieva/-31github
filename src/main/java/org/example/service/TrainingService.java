package org.example.service;

import org.example.dao.TrainingDAO;
import org.example.model.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingService {
    private final TrainingDAO trainingDAO;

    @Autowired
    public TrainingService(TrainingDAO trainingDAO) {
        this.trainingDAO = trainingDAO;
    }

    public List<Training> getAllTraining() {
        return trainingDAO.findAll();
    }

    public Training getTrainingByID(Long id) {
        return trainingDAO.findById(id);
    }

    public Training createTraining(Training training) {
        if (training.getId() == null) {
            trainingDAO.create(training);
        }
        return training;
    }
}
