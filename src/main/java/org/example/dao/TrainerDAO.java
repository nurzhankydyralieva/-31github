package org.example.dao;

import org.example.model.Trainer;

import java.util.List;

public interface TrainerDAO {
    Trainer findById(Long id);

    List<Trainer> findAll();

    void save(Trainer trainer);

    void update(Trainer trainer);

    void delete(Long id);

}
