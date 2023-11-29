package org.project_6;

import com.example.project.config.SpringConfig;
import com.example.project.entity.*;
import com.example.project.enums.TrainingType;
import com.example.project.facade.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserFacade userFacade = context.getBean(UserFacade.class);
        TrainingFacade trainingFacade = context.getBean(TrainingFacade.class);
        TraineeFacade traineeFacade = context.getBean(TraineeFacade.class);
        TrainerFacade trainerFacade = context.getBean(TrainerFacade.class);
        SpecializationFacade specializationFacade = context.getBean(SpecializationFacade.class);

        var user = User.builder().firstName("Tom").lastName("Smith").userName("Tom").password("333").isActive(true).criteria("Criteria for Selecting Training Modalities").build();
        var updatedUser = User.builder().firstName("Katy").lastName("Simson").userName("Moon").password("123").isActive(true).build();
//        userFacade.createUser(user);
//        userFacade.selectAllUsers().stream().forEach(System.out::println);
//        userFacade.selectUserById(1);
//        userFacade.updateUser(2, updatedUser);
//        userFacade.usersUserNameAndPasswordGenerator();


        var specialization = Specialization.builder().speciality("Physiologic and Psychological Concerns").build();
        var updatedSpecialization = Specialization.builder().speciality("Information technology specializations").build();
//        specializationFacade.createSpecialization(specialization);
//        specializationFacade.selectAllSpecializations().stream().forEach(System.out::println);
//        System.out.println(specializationFacade.selectSpecializationById(1));
//        specializationFacade.updateSpecialization(1, updatedSpecialization);

        var trainer = Trainer.builder().specialization(new Specialization(1)).user(new User(1)).build();
        var updatedTrainer = Trainer.builder().specialization(new Specialization(2)).user(new User(3)).build();
//        trainerFacade.createTrainer(trainer);
//        trainerFacade.selectAllTrainers();
//        trainerFacade.selectTrainerById(1);
//        trainerFacade.updateTrainer(1, updatedTrainer);
//        System.out.println(trainerFacade.selectTrainerByUserName("Tom"));
//        trainerFacade.updateTrainerPassword(1, "8888");
//        trainerFacade.activateTrainer(1);
//        trainerFacade.deactivateTrainer(1);
//        trainerFacade.selectUserNameAndPasswordTrainer("Tom", "333");
//        trainerFacade.selectTrainerTrainingListByTrainerUserNameAndCriteria("Tom", "sport");
//        System.out.println(trainerFacade.selectActiveTrainersList(1));
//        trainerFacade.deleteTrainerByUserName("Tom");
//        trainerFacade.trainersUserNameAndPasswordGenerator();
//
//        Set<Trainer> trainers = new HashSet<>();
//        trainers.add(Trainer.builder().specialization(new Specialization()).user(new User()).build());
//        traineeFacade.updateTraineeTrainerList(4, trainers);


        Set<TrainingType> types = new HashSet<>();
        types.add(TrainingType.WEIGHT_TRAINING);
        var training = Training.builder().traineeId(new Trainee(1)).trainerId(new Trainer(1)).trainingName("Gymnastics")
                .trainingDate(new Date()).trainingDuration(2).trainingType(types).build();
        var updatedTraining = Training.builder().traineeId(new Trainee(1)).trainerId(new Trainer(1)).trainingName("Swimming")
                .trainingDate(new Date()).trainingDuration(2).build();
        trainingFacade.createTraining(training);
        //trainingFacade.selectAllTrainings();
        //trainingFacade.selectTrainingById(1);
        // trainingFacade.updateTraining(1, updatedTraining);


        var trainee = Trainee.builder().dateOfBirth(new Date()).address("Kyrgyzstan, Bishkek 33").user(new User(1)).build();
        var updatedTrainee = Trainee.builder().dateOfBirth(new Date()).address("Mexico").user(new User(3)).build();
        //traineeFacade.createTrainee(trainee);
//        traineeFacade.selectAllTrainees().stream().forEach(System.out::println);
//        System.out.println(traineeFacade.selectTraineeById(2));
//        traineeFacade.updateTrainee(1, updatedTrainee);
//        System.out.println(traineeFacade.selectTraineeByUserName("Katy"));
//        traineeFacade.updateTraineePassword(1, "trainee");
//        traineeFacade.activateTrainee(1);
//        traineeFacade.deactivateTrainee(1);
//        traineeFacade.selectUserNameAndPasswordTrainee("Tom", "333");
//        traineeFacade.deleteTraineeByUserName("Tom");
//        traineeFacade.selectTraineeTrainingListByTraineeUserNameAndCriteria("Tom", "sport");
//        traineeFacade.deleteTrainee(3);
        // traineeFacade.traineesUserNameAndPasswordGenerator();

        context.close();
    }
}
