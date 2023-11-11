package org.crud_test.project.service;

import org.crud_test.project.dao.TraineeDAO;
import org.crud_test.project.model.Trainee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TraineeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TrainerService.class);

    private TraineeDAO traineeDAO;

    @Autowired
    public TraineeService(TraineeDAO traineeDAO) {
        this.traineeDAO = traineeDAO;
    }

    public void create(Map<Integer, Trainee> trainees) {
        LOGGER.info("Trainee is created");
        traineeDAO.writeDataToTraineeFile(trainees);
    }

    public Map<Integer, Trainee> select() {
        LOGGER.info("All trainees are selected");
        return traineeDAO.readDataFromTraineeFile();
    }

    public void update(int id, Trainee updatedTrainee) {
        LOGGER.info("Trainee is updated");
        traineeDAO.updateDataInTraineeFile(id, updatedTrainee);
    }
    public boolean delete(int id){
        LOGGER.info("Trainee is deleted by id");
        traineeDAO.deleteDataInTraineeFile(id);
        return true;
    }
}
