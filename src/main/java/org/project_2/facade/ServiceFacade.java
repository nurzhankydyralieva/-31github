package org.project_2.facade;

import com.example.project.entity.Specialization;
import com.example.project.entity.Trainer;
import com.example.project.entity.User;
import com.example.project.service.SpecializationService;
import com.example.project.service.TrainerService;
import com.example.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ServiceFacade {

    private final TrainerService trainerService;
    private final SpecializationService specializationService;
    private final UserService userService;

    public void createSpecialization(Specialization specialization) {
        specializationService.createSpecialization(specialization);
    }

    public void createTrainer(Trainer trainer) {
        trainerService.createTrainer(trainer);
    }

    public List<Trainer> selectAllTrainers() {
        return trainerService.selectAllTrainers();
    }

    public void createUser(User user) {
        userService.createUser(user);
    }
}
