package org.example.storage;

import org.example.config.StorageConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitStorage {
//        @Value("#{${simple.map}}")
//    private Map<String, String> simpleMap;
//
//
//    @PostConstruct
//    public void initializeStorage() {
//        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
    private static final Logger LOGGER = LoggerFactory.getLogger(InitStorage.class);
    private StorageConfig storage;

    @Autowired
    public void setStorage(StorageConfig storage) {
        this.storage = storage;
    }

    public StorageConfig getStorage() {
        return storage;
    }

    @PostConstruct
    public void init() {
        LOGGER.info("Get all Trainers, Trainees and Trainings from database");
        storage.trainerMap().values().stream().forEach(System.out::println);
        storage.traineeMap().values().stream().forEach(System.out::println);
        storage.trainingMap().values().stream().forEach(System.out::println);
    }
}
