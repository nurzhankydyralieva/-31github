package org.example.dao.impl;

import org.example.dao.TraineeDAO;
import org.example.model.Trainee;
import org.example.model.User;

import javax.annotation.PostConstruct;
import java.util.*;

public class InMemoryTraineeDAO implements TraineeDAO {
    private Map<Integer, Trainee> traineeMap;
    private static int TRAINEE_COUNTER;

    @PostConstruct
    public void initialDatabase() {
        traineeMap = new HashMap<>();
        traineeMap.put(++TRAINEE_COUNTER, new Trainee(1L, Calendar.getInstance().getTime(), "London", new User()));
        traineeMap.put(++TRAINEE_COUNTER, new Trainee(2L, Calendar.getInstance().getTime(), "Moscow", new User()));
        traineeMap.put(++TRAINEE_COUNTER, new Trainee(3L, Calendar.getInstance().getTime(), "Paris", new User()));
    }

    @Override
    public List<Trainee> findAll() {
        return new ArrayList<>(traineeMap.values());
    }

    @Override
    public Trainee findById(Long id) {
        return traineeMap.values().stream().filter(trainee -> trainee.getId() == id).findAny().orElse(null);
    }

    @Override
    public void save(Trainee trainer) {

    }

    @Override
    public void update(Trainee trainer) {

    }

    @Override
    public void delete(Long id) {

    }


}
