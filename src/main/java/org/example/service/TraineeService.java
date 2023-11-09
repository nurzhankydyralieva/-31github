package org.example.service;

import org.example.dao.TraineeDAO;
import org.example.model.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TraineeService {
    private final TraineeDAO traineeDAO;

    @Autowired
    public TraineeService(TraineeDAO traineeDAO) {
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

}
