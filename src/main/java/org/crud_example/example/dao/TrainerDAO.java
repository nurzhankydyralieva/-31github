package org.crud_example.example.dao;

import org.crud_example.example.model.Trainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TrainerDAO {
    private static final Logger LOGGER = LoggerFactory.getLogger(TrainerDAO.class);
    private Map<Long, Trainer> trainerStorage = new HashMap<>();

    public Trainer findById(Long id) {
        return trainerStorage.get(id);
    }

    public List<Trainer> findAll() {
        return new ArrayList<>(trainerStorage.values());
    }


    public Trainer create(Trainer trainer) {
        Trainer trainer1 = trainerStorage.put(trainer.getId(), trainer);
        LOGGER.info("Trainer is created");
        return trainer1;
    }

    public void update(Trainer trainer) {
        if (trainerStorage.containsKey(trainer.getId())) {
            trainerStorage.put(trainer.getId(), trainer);
        }
    }


}
