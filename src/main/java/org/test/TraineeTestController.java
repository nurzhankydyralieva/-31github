package org.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class TraineeTestController {

    private final TraineeTestService traineeTestService;

    @GetMapping("/all")
    public List<TraineeTest> getTrainees() {
        return traineeTestService.getAllTrainees();
    }

    @PostMapping("/add")
    public void addTrainee(@RequestBody TraineeTest test) {
        traineeTestService.addTrainee(test);
    }

    @PutMapping("/update")
    public void updateTrainee(@RequestBody TraineeTest test) {
        traineeTestService.updateTrainee(test);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") UUID id) {
        traineeTestService.deleteTrainee(id);
    }

}
