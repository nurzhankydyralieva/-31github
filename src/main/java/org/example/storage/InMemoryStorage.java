//package org.example.storage;
//
//import org.example.model.*;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//@Component
//public class InMemoryStorage {
//
//    private Map<Long, Trainee> traineeMap;
//    private Map<Long, Trainer> trainerMap;
//    private Map<Long, Training> trainingMap;
//
//    @PostConstruct
//    public void traineeInit() {
//        System.out.println("All trainees in database");
//        traineeMap = new HashMap<>();
//        traineeMap.put(1L, new Trainee(1L, Calendar.getInstance().getTime(), "London", new User(1L)));
//        traineeMap.put(2L, new Trainee(2L, Calendar.getInstance().getTime(), "Moscow", new User(2L)));
//        traineeMap.put(3L, new Trainee(3L, Calendar.getInstance().getTime(), "Paris", new User(3L)));
//        traineeMap.put(3L, new Trainee(3L, Calendar.getInstance().getTime(), "New York", new User(3L)));
//        for (Map.Entry<Long, Trainee> entry : traineeMap.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//        System.out.println("All trainers");
//        trainerMap = new HashMap<>();
//        trainerMap.put(1L, new Trainer(1L, "Tom"));
//        trainerMap.put(2L, new Trainer(2L, "Katy"));
//        trainerMap.put(3L, new Trainer(3L, "White"));
//        for (Map.Entry<Long, Trainer> entry : trainerMap.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//
//        System.out.println("All training");
//        trainingMap = new HashMap<>();
//        trainingMap.put(1L, new Training(1L, new Trainee(1L), new Trainer(1L), "Box", new TrainingType(), new Date(2000, Calendar.DECEMBER, 21), 22));
//        trainingMap.put(2L, new Training(2L, new Trainee(2L), new Trainer(2L), "Dance", new TrainingType(), new Date(2000, Calendar.DECEMBER, 21), 22));
//        for (Map.Entry<Long, Training> entry : trainingMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
//
//}
