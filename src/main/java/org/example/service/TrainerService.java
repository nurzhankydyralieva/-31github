package org.example.service;

import org.example.config.StorageConfig;
import org.example.dao.TrainerDAO;
import org.example.model.Trainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class TrainerService {
    private StorageConfig storage;
    private final TrainerDAO trainerDAO;
    private static final Logger LOGGER = LoggerFactory.getLogger(TrainerService.class);

    @Autowired
    public TrainerService(StorageConfig storage, TrainerDAO trainerDAO) {
        this.storage = storage;
        this.trainerDAO = trainerDAO;
    }

    public List<Trainer> getAllTrainers() {
        return trainerDAO.findAll();
    }

    public Trainer getTrainerByID(Long id) {
        return trainerDAO.findById(id);
    }

    public Trainer createOrUpdateTrainer(Trainer trainer) {
        LOGGER.info("Trainer is created");
        if (trainer.getId() == null) {
            trainerDAO.create(trainer);
        } else {
            trainerDAO.update(trainer);
        }
        return trainer;
    }

    @PostConstruct
    public void init() {
        LOGGER.info("Get all Trainers from database");
        storage.trainerMap().values().stream().forEach(System.out::println);
    }
}
