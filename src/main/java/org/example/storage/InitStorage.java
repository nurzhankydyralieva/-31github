package org.example.storage;

import org.example.config.StorageConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitStorage {
    private static final Logger LOGGER = LoggerFactory.getLogger(InitStorage.class);
    private StorageConfig storage;

    @Autowired
    public void setStorage(StorageConfig storage) {
        this.storage = storage;
    }

    @PostConstruct
    public void init() {
        LOGGER.info("Get all Trainers, Trainees and Trainings from database");
        storage.trainerMap().values().stream().forEach(System.out::println);
        storage.traineeMap().values().stream().forEach(System.out::println);
        storage.trainingMap().values().stream().forEach(System.out::println);
    }
}
