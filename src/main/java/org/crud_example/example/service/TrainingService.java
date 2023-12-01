package org.crud_example.example.service;

import org.crud_example.example.dao.TrainingDAO;
import org.crud_example.example.model.Training;
import org.crud_example.example.config.StorageConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class TrainingService {
    private StorageConfig storage;
    private final TrainingDAO trainingDAO;
    private static final Logger LOGGER = LoggerFactory.getLogger(TrainingService.class);

    @Autowired
    public TrainingService(StorageConfig storage, TrainingDAO trainingDAO) {
        this.storage = storage;
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

    @PostConstruct
    public void init() {
        LOGGER.info("Get all Trainings from database");
        storage.trainingMap().values().stream().forEach(System.out::println);
    }
}
