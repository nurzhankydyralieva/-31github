package org.example.dao;

import org.example.model.Trainer;

import java.util.List;

public interface TrainerDAO {
    Trainer findById(Long id);

    List<Trainer> findAll();

    void create(Trainer trainer);

    void update(Trainer trainer);


}
