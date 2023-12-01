package org.crud_example.example.dao;

import org.crud_example.example.model.Training;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TrainingDAO {
    private final Map<Long, Training> trainingMap = new HashMap<>();

    public Training findById(Long id) {
        return trainingMap.get(id);
    }

    public List<Training> findAll() {
        return new ArrayList<>(trainingMap.values());
    }

    public void create(Training training) {
        trainingMap.put(training.getId(), training);
    }
}
