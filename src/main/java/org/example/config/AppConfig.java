package org.example.config;

import org.example.dao.TraineeDAO;
import org.example.dao.TrainerDAO;
import org.example.dao.TrainingDAO;
import org.example.dao.impl.InMemoryTraineeDAO;
import org.example.dao.impl.InMemoryTrainerDAO;
import org.example.dao.impl.InMemoryTrainingDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    public TrainerDAO trainerDAO() {
        return new InMemoryTrainerDAO();
    }

    @Bean
    public TraineeDAO traineeDAO() {
        return new InMemoryTraineeDAO();
    }

    @Bean
    public TrainingDAO trainingDAO() {
        return new InMemoryTrainingDAO();
    }
}
