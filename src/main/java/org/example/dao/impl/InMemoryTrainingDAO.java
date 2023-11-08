package org.example.dao.impl;

import org.example.dao.TrainingDAO;
import org.example.model.Trainee;
import org.example.model.Trainer;
import org.example.model.Training;
import org.example.model.TrainingType;

import javax.annotation.PostConstruct;
import java.util.*;

public class InMemoryTrainingDAO implements TrainingDAO {
    private Map<Long, Training> trainingMap;
    private Long idCounter = 1L;

    @PostConstruct
    public void initialDatabase() {
        trainingMap = new HashMap<>();
        trainingMap.put(1L, new Training(1L, new Trainee(1L), new Trainer(1L), "Box", new TrainingType(), new Date(2000, Calendar.DECEMBER, 21), 22));
        trainingMap.put(2L, new Training(2L, new Trainee(2L), new Trainer(2L), "Dance", new TrainingType(), new Date(2000, Calendar.DECEMBER, 21), 22));
    }

    @Override

    public Training findById(Long id) {
        return trainingMap.values().stream().filter(training -> Objects.equals(training.getId(), id)).findAny().orElse(null);
    }

    @Override
    public List<Training> findAll() {
        return new ArrayList<>(trainingMap.values());
    }

    @Override
    public void create(Training training) {
        training.setId(idCounter);
        trainingMap.put(idCounter, training);
        idCounter++;
    }
}
