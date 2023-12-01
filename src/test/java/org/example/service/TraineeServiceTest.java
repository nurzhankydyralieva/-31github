package org.example.service;

import org.crud_example.example.dao.TraineeDAO;
import org.crud_example.example.model.Trainee;
import org.crud_example.example.model.User;
import org.crud_example.example.service.TraineeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TraineeServiceTest {
    @Mock
    private TraineeDAO traineeDAO;
    @InjectMocks
    private TraineeService traineeService;
    private Trainee newTrainee;

    @Before
    public void setUp() throws Exception {
        newTrainee = new Trainee();
        newTrainee.setId(1L);
        newTrainee.setAddress("Paris");
    }

    @Test
    public void testGetAllTrainees() {
        List<Trainee> trainees = new ArrayList<>();
        trainees.add(new Trainee(1L, Calendar.getInstance().getTime(), "Moscow", new User(1L)));
        trainees.add(new Trainee(2L, Calendar.getInstance().getTime(), "Moscow", new User(2L)));

        when(traineeDAO.findAll()).thenReturn(trainees);

        List<Trainee> traineeList = traineeService.getAllTrainees();

        assertEquals(2, traineeList.size());
        assertEquals("Moscow", traineeList.get(1).getAddress());
    }

    @Test
    public void testGetTraineeById() {
        Long id = 1L;
        Trainee newTrainee = Trainee.builder().id(id).address("Kyrgyzstan").build();

        when(traineeDAO.findById(id)).thenReturn(newTrainee);

        Trainee trainee = traineeService.getTraineeById(id);
        assertNotNull(trainee);
        assertEquals(id, trainee.getId());
        assertEquals("Kyrgyzstan", trainee.getAddress());
    }

    @Test
    public void testCreateOrUpdateTrainee() {
        if (newTrainee.getId() == null) {
            traineeDAO.create(newTrainee);
        } else {
            traineeDAO.update(newTrainee);
        }
        assertEquals("Paris", newTrainee.getAddress());
    }

    @Test
    public void testDeleteTrainee() {
        traineeService.deleteTrainee(newTrainee.getId());
    }
}