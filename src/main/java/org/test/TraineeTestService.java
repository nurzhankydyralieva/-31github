package org.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TraineeTestService {

    private final TraineeTestDAO traineeTestDAO;

    @Transactional
    public List<TraineeTest> getAllTrainees() {
        return traineeTestDAO.getAllTrainees();
    }

    @Transactional
    public TraineeTest getTrainee(UUID id) {
        return traineeTestDAO.getTrainee(id);
    }

    @Transactional
    public void addTrainee(TraineeTest test) {
        traineeTestDAO.addTrainee(test);
    }

    @Transactional
    public void updateTrainee(TraineeTest test) {
        traineeTestDAO.updateTrainee(test);
    }

    @Transactional
    public void deleteTrainee(UUID id) {
        traineeTestDAO.deleteTrainee(id);
    }
}
