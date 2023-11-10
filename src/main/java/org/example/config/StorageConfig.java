package org.example.config;

import org.example.model.Trainee;
import org.example.model.Trainer;
import org.example.model.Training;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@PropertySource("classpath:application.properties")
public class StorageConfig {
    @Value("#{${trainer.map}}")
    private Map<String, Map<String, String>> trainersMap;
    @Value("#{${trainee.map}}")
    private Map<String, Map<String, String>> traineeMap;
    @Value("#{${training.map}}")
    private Map<String, Map<String, String>> trainingMap;
    @Bean
    public Map<String, Trainer> trainerMap() {
       Map<String, Trainer> trainerResult = new HashMap<>();

        for (Map.Entry<String, Map<String, String>> entry : trainersMap.entrySet()) {
            String trainerKey = entry.getKey();
            Map<String, String> trainerProperties = entry.getValue();

            Trainer trainer = new Trainer();
            trainer.setId(Long.valueOf(trainerProperties.get("id")));
            trainer.setName(trainerProperties.get("name"));

            trainerResult.put(trainerKey, trainer);
        }

        return trainerResult;
    }

    @Bean
    public Map<String, Trainee> traineeMap() {
        Map<String, Trainee> traineeResult = new HashMap<>();

        for (Map.Entry<String, Map<String, String>> entry : traineeMap.entrySet()) {
            String traineeKey = entry.getKey();
            Map<String, String> traineeProperties = entry.getValue();

            Trainee trainee = new Trainee();
            trainee.setId(Long.valueOf(traineeProperties.get("id")));
            //trainee.setDateOfBirth(traineeProperties.get());
            trainee.setAddress(traineeProperties.get("address"));
            // trainee.setUserId(traineeProperties.get());
            traineeResult.put(traineeKey, trainee);
        }
        return traineeResult;
    }

    @Bean
    public Map<String, Training> trainingMap() {
        Map<String, Training> trainingResult = new HashMap<>();
        for (Map.Entry<String, Map<String, String>> entry : trainingMap.entrySet()) {
            String trainingKey = entry.getKey();
            Map<String, String> trainingProperties = entry.getValue();

            Training training = new Training();
            training.setId(Long.valueOf(trainingProperties.get("id")));
            training.setTrainingName(trainingProperties.get("trainingName"));

            trainingResult.put(trainingKey, training);
        }
        return trainingResult;
    }
}
