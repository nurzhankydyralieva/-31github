package org.crud_example.example.service;

import org.crud_example.example.dao.TraineeDAO;
import org.crud_example.example.model.Trainee;
import org.crud_example.example.config.StorageConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;


@Service
public class TraineeService {
    private StorageConfig storage;
    private final TraineeDAO traineeDAO;
    private static final Logger LOGGER = LoggerFactory.getLogger(TraineeService.class);

    @Autowired
    public TraineeService(StorageConfig storage, TraineeDAO traineeDAO) {
        this.storage = storage;
        this.traineeDAO = traineeDAO;
    }

    public List<Trainee> getAllTrainees() {
        return traineeDAO.findAll();
    }

    public Trainee getTraineeById(Long id) {
        return traineeDAO.findById(id);
    }

    public Trainee createOrUpdateTrainee(Trainee trainee) {
        if (trainee.getId() == null) {
            traineeDAO.create(trainee);
        } else {
            traineeDAO.update(trainee);
        }
        return trainee;
    }

    public void deleteTrainee(Long id) {
        traineeDAO.delete(id);
    }


    @PostConstruct
    public void init() {
        LOGGER.info("Get all Trainees from database");
        storage.traineeMap().values().stream().forEach(System.out::println);
    }

}
