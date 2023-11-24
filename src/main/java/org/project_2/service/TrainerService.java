package org.project_2.service;

import com.example.project.dao.TrainerDAO;
import com.example.project.entity.Trainer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainerService {
    private final TrainerDAO trainerDAO;

    public void createTrainer(Trainer trainer) {
        trainerDAO.createTrainer(trainer);
    }

    public List<Trainer> selectAllTrainers() {
        return trainerDAO.selectAllTrainers();
    }
}
