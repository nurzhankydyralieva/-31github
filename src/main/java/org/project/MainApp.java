package org.project;

import org.project.config.AppConfig;
import org.project.model.Trainer;
import org.project.storage.Storage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Storage storage = context.getBean(Storage.class);
        Map<Integer, Trainer> trainerMap = storage.getTrainers();

        trainerMap.forEach((id, trainer) -> System.out.println("ID: " + id + ", Name: " + trainer.getName()));
    }
}
