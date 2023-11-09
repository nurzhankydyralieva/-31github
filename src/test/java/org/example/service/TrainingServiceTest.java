package org.example.service;

import org.example.dao.TrainingDAO;
import org.example.model.Trainee;
import org.example.model.Trainer;
import org.example.model.Training;
import org.example.model.TrainingType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TrainingServiceTest {
    @Mock
    private TrainingDAO trainingDAO;
    @InjectMocks
    private TrainingService trainingService;

    @Test
    public void testGetAllTraining() {
        List<Training> trainings = new ArrayList<>();
        trainings.add(new Training(1L, new Trainee(1L), new Trainer(1L, "Martin"), "Box", new TrainingType(), Date.valueOf(LocalDate.now()), 2));
        trainings.add(new Training(1L, new Trainee(1L), new Trainer(1L, "Maxim"), "Dance", new TrainingType(), Date.valueOf(LocalDate.now()), 2));

        when(trainingDAO.findAll()).thenReturn(trainings);

        List<Training> trainingList = trainingService.getAllTraining();
        assertEquals(2, trainingList.size());
        assertEquals("Box", trainings.get(0).getTrainingName());
        assertEquals("Dance", trainings.get(1).getTrainingName());
    }

    @Test
    public void testGetTrainingByID() {
        Long id = 1L;
        Training newTraining = new Training(1L, new Trainee(1L), new Trainer(1L, "Martin"), "Box", new TrainingType(), Date.valueOf(LocalDate.now()), 2);

        when(trainingDAO.findById(id)).thenReturn(newTraining);
        Training training = trainingService.getTrainingByID(id);

        assertNotNull(training);
        assertEquals(id, training.getId());
        assertEquals("Box", training.getTrainingName());
    }

    @Test
    public void testCreateTraining() {
        Training training = new Training();
        training.setId(1L);
        training.setTrainingName("Singing");
        if (training.getId() == null) {
            trainingDAO.create(training);
        }
        assertEquals("Singing", training.getTrainingName());
    }
}