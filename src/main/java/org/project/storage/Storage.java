package org.project.storage;


import org.project.model.Trainer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@Component
public class Storage {
    @Value("${data.file.path.trainer}")
    private String dataFilePath;
    private Map<Integer, Trainer> trainers = new HashMap<>();
    public Map<Integer, Trainer> getTrainers() {
        return trainers;
    }

    public void writeDataToTrainerFile(Map<Integer, Trainer> trainers) {
        try (FileWriter writer = new FileWriter("data_trainer.txt")) {
            for (Map.Entry<Integer, Trainer> entry : trainers.entrySet()) {
                Trainer trainer = entry.getValue();
                writer.write(trainer.getId() + "," + trainer.getName() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
