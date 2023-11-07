package org.example.dao.impl;

import org.example.dao.TrainerDAO;
import org.example.model.Trainer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class InMemoryTrainerDAO implements TrainerDAO {
    private Map<Long, Trainer> trainerMap;
    private Long idCounter = 1L;
    @PostConstruct
    public void initialDatabase(){
        trainerMap = new HashMap<>();
        trainerMap.put(1L,new Trainer(1L,"Tom"));
        trainerMap.put(2L,new Trainer(2L,"Katy"));
        trainerMap.put(3L,new Trainer(3L,"White"));
    }

    @Override
    public Trainer findById(Long id) {
        return trainerMap.get(id);
    }

    @Override
    public List<Trainer> findAll() {
        return new ArrayList<>(trainerMap.values());
    }

    @Override
    public void save(Trainer trainer) {
        trainer.setId(idCounter);
        trainerMap.put(idCounter, trainer);
        idCounter++;
    }

    @Override
    public void update(Trainer trainer) {
        if (trainerMap.containsKey(trainer.getId())) {
            trainerMap.put(trainer.getId(), trainer);
        }
    }

    @Override
    public void delete(Long id) {
        trainerMap.remove(id);
    }

}
