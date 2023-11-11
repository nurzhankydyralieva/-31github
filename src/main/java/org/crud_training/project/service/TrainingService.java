package org.crud_training.project.service;


import org.crud_training.project.dao.TrainingDAO;
import org.crud_training.project.model.Training;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TrainingService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TrainingService.class);
    private TrainingDAO trainingDAO;

    @Autowired
    public TrainingService(TrainingDAO trainingDAO) {
        this.trainingDAO = trainingDAO;
    }

    public void create(Map<Integer, Training> trainings) {
        LOGGER.info("Training is created");
        trainingDAO.writeDataToTrainingFile(trainings);
    }

    public Map<Integer, Training> select() {
        LOGGER.info("All trainings are selected");
        return trainingDAO.readDataFromTrainingFile();
    }

}
