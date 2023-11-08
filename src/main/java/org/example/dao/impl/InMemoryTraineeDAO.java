package org.example.dao.impl;

import org.example.dao.TraineeDAO;
import org.example.model.Trainee;
import org.example.model.User;

import javax.annotation.PostConstruct;
import java.util.*;

public class InMemoryTraineeDAO implements TraineeDAO {
    private Map<Long, Trainee> traineeMap;
    private Long idCounter = 1L;

    @PostConstruct
    public void initialDatabase() {
        traineeMap = new HashMap<>();
        traineeMap.put(1L, new Trainee(1L, Calendar.getInstance().getTime(), "London", new User(1L)));
        traineeMap.put(2L, new Trainee(2L, Calendar.getInstance().getTime(), "Moscow", new User(2L)));
        traineeMap.put(3L, new Trainee(3L, Calendar.getInstance().getTime(), "Paris", new User(3L)));
    }

    @Override
    public List<Trainee> findAll() {
        return new ArrayList<>(traineeMap.values());
    }

    @Override
    public Trainee findById(Long id) {
        return traineeMap.values().stream().filter(trainee -> Objects.equals(trainee.getId(), id)).findAny().orElse(null);
    }

    @Override
    public void create(Trainee trainee) {
        trainee.setId(idCounter);
        traineeMap.put(idCounter, trainee);
        idCounter++;
    }

    @Override
    public void update(Trainee trainee) {
        if (traineeMap.containsKey(trainee.getId())) {
            traineeMap.put(trainee.getId(), trainee);
        }
    }

    @Override
    public void delete(Long id) {
        traineeMap.remove(id);
    }
}
