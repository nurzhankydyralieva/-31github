package org.example.dao;

import org.example.model.Training;

import java.util.List;

public interface TrainingDAO {
    Training findById(Long id);
    List<Training> findAll();
    void create(Training training);
}
