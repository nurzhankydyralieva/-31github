package org.example.service;

import org.crud_example.example.dao.TrainerDAO;
import org.crud_example.example.model.Trainer;
import org.crud_example.example.service.TrainerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TrainerServiceTest {
    @Mock
    private TrainerDAO trainerDAO;
    @InjectMocks
    private TrainerService trainerService;

    @Test
    public void testCreateOrUpdateTrainer() {
        Trainer newTrainer = new Trainer();
        newTrainer.setId(1L);
        newTrainer.setName("Martin");
        if (newTrainer.getId() == null) {
            trainerDAO.create(newTrainer);
        } else {
            trainerDAO.update(newTrainer);
        }
        assertEquals("Martin", newTrainer.getName());
    }


    @Test
    public void testGetAllTrainers() {
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer(1L, "Mary"));
        trainers.add(new Trainer(2L, "Olson"));

        when(trainerDAO.findAll()).thenReturn(trainers);

        List<Trainer> trainerList = trainerService.getAllTrainers();
        assertEquals(2, trainerList.size());
        assertEquals("Mary", trainers.get(0).getName());
        assertEquals("Olson", trainers.get(1).getName());
    }

    @Test
    public void testGetTrainerByID() {
        Long id = 1L;
        Trainer newTrainer = new Trainer(id, "Mushroom");

        when(trainerDAO.findById(id)).thenReturn(newTrainer);

        Trainer trainer = trainerService.getTrainerByID(id);
        assertNotNull(trainer);
        assertEquals(id, trainer.getId());
        assertEquals("Mushroom", trainer.getName());
    }
}