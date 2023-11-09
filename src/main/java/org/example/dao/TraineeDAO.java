package org.example.dao;

import org.example.model.Trainee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TraineeDAO {
    private final Map<Long, Trainee> traineeMap = new HashMap<>();


    public Trainee findById(Long id) {
        return traineeMap.get(id);
    }

    public List<Trainee> findAll() {
        return new ArrayList<>(traineeMap.values());
    }

    public void create(Trainee trainee) {

        traineeMap.put(trainee.getId(), trainee);
    }

    public void update(Trainee trainee) {
        if (traineeMap.containsKey(trainee.getId())) {
            traineeMap.put(trainee.getId(), trainee);
        }
    }

    public void delete(Long id) {
        traineeMap.remove(id);
    }


}
