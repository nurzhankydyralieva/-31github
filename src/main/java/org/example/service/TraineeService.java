package org.example.service;

import org.example.dao.TraineeDAO;
import org.example.model.Trainee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeService {
    private TraineeDAO traineeDAO;

    public TraineeService(TraineeDAO traineeDAO) {
        this.traineeDAO = traineeDAO;
    }
    public List<Trainee> getAllTrainees(){
        return traineeDAO.findAll();
    }
    public Trainee getTraineeById(Long id){
        return traineeDAO.findById(id);
    }
}
