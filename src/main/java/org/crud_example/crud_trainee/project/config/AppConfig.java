package org.crud_example.crud_trainee.project.config;

import org.crud_example.crud_trainee.project.dao.TraineeDAO;
import org.crud_example.crud_trainee.project.dao.TrainerDAO;
import org.crud_example.crud_trainee.project.service.TraineeService;
import org.crud_example.crud_trainee.project.service.TrainerService;
import org.crud_example.crud_trainee.project.storage.Storage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.crud_trainee.project")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Value("${data.file.path}")
    private String dataFilePath;
    @Value("${data.file.path.trainee}")
    private String dataTraineePath;

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
    public TrainerDAO trainerDAO() {
        TrainerDAO trainerDAO = new TrainerDAO();
        trainerDAO.setDataFilePath(dataFilePath);
        return trainerDAO;
    }

    @Bean
    public TraineeDAO traineeDAO() {
        TraineeDAO traineeDAO = new TraineeDAO();
        traineeDAO.setDataFilePath(dataTraineePath);
        return traineeDAO;
    }

}
