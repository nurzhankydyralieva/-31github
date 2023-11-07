package org.example.service;

import org.example.dao.TrainerDAO;
import org.example.model.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {
    private TrainerDAO trainerDAO;

    @Autowired
    public TrainerService(TrainerDAO trainerDAO) {
        this.trainerDAO = trainerDAO;
    }

    public List<Trainer> getAllTrainers() {
        return trainerDAO.findAll();
    }

    public Trainer createOrUpdateTrainer(Trainer trainer) {
        if (trainer.getId() == null) {
            trainerDAO.save(trainer);
        } else {
            trainerDAO.update(trainer);
        }
        return trainer;
    }

    public void deleteTrainer(Long id) {
        trainerDAO.delete(id);
    }

}
