package org.example.storage;

import org.example.config.StorageConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitStorage {
    //    @Value("#{${simple.map}}")
//    private Map<String, String> simpleMap;
//
//
//    @PostConstruct
//    public void initializeStorage() {
//        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }

    private StorageConfig storage;

    @Autowired
    public void setStorage(StorageConfig storage) {
        this.storage = storage;
    }

    @PostConstruct
    public void init() {
        System.out.println(storage.trainerMap());
        System.out.println(storage.traineeMap());
        System.out.println(storage.trainingMap());
    }
}
