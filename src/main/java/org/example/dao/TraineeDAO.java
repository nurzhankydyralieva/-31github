package org.example.dao;

import org.example.model.Trainee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class TraineeDAO {
    private Map<Long, Trainee> traineeStorage = new HashMap<>();

    public Trainee findById(Long id) {
        return traineeStorage.get(id);
    }

    public List<Trainee> findAll() {
        return new ArrayList<>(traineeStorage.values());
    }

    public void create(Trainee trainee) {
        traineeStorage.put(trainee.getId(), trainee);
    }


    public void update(Trainee trainee) {
        if (traineeStorage.containsKey(trainee.getId())) {
            traineeStorage.put(trainee.getId(), trainee);
        }
    }

    public void delete(Long id) {
        traineeStorage.remove(id);
    }



}
