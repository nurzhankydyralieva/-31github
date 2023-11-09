package org.example.dao;

import org.example.model.Trainer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TrainerDAO {

    private Map<Long, Trainer> trainerStorage = new HashMap<>();

    public Trainer findById(Long id) {
        return trainerStorage.get(id);
    }

    public List<Trainer> findAll() {
        return new ArrayList<>(trainerStorage.values());
    }

    public void create(Trainer trainer) {
        trainerStorage.put(trainer.getId(), trainer);
    }


    public void update(Trainer trainer) {
        if (trainerStorage.containsKey(trainer.getId())) {
            trainerStorage.put(trainer.getId(), trainer);
        }
    }


}
