package org.crud_training.project.config;


import org.crud_training.project.dao.*;
import org.crud_training.project.service.*;
import org.crud_training.project.storage.Storage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.crud_training")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Value("${data.file.path.trainer}")
    private String dataTrainerPath;
    @Value("${data.file.path.trainee}")
    private String dataTraineePath;
    @Value("${data.file.path.training}")
    private String dataTrainingPath;

    @Bean
    public Storage storage() {
        return new Storage();
    }

    @Bean
    public TrainerService trainerService() {
        return new TrainerService(trainerDAO());
    }

    @Bean
    public TraineeService traineeService() {
        return new TraineeService(traineeDAO());
    }

    @Bean
    public TrainingService trainingService() {
        return new TrainingService(trainingDAO());
    }

    @Bean
    public TrainerDAO trainerDAO() {
        TrainerDAO trainerDAO = new TrainerDAO();
        trainerDAO.setDataFilePath(dataTrainerPath);
        return trainerDAO;
    }

    @Bean
    public TraineeDAO traineeDAO() {
        TraineeDAO traineeDAO = new TraineeDAO();
        traineeDAO.setDataFilePath(dataTraineePath);
        return traineeDAO;
    }

    @Bean
    public TrainingDAO trainingDAO() {
        TrainingDAO trainingDAO = new TrainingDAO();
        trainingDAO.setDataFilePath(dataTrainingPath);
        return trainingDAO;
    }

}
