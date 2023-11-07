package org.example.dao;

import org.example.model.Trainee;

import java.util.List;

public interface TraineeDAO {
    Trainee findById(Long id);

    List<Trainee> findAll();


    void save(Trainee trainer);

    void update(Trainee trainer);

    void delete(Long id);
}
