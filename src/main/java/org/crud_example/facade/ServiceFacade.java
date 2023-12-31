//package org.facade;
//
//import com.example.project.entity.*;
//import com.example.project.service.PasswordGeneratorService;
//import com.example.project.service.impl.*;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Set;
//
//@Component
//@RequiredArgsConstructor
//public class ServiceFacade {
//
//    private final TrainerServiceImpl trainerService;
//    private final SpecializationService specializationService;
//    private final UserServiceImpl userService;
//    private final TraineeServiceImpl traineeService;
//    private final TrainingServiceImpl trainingService;
//    private final TrainingTypeService trainingTypeService;
//    private final PasswordGeneratorService passwordGeneratorService;
//
//    public void createTraining(Training training) {
//        trainingService.createTraining(training);
//    }
//
//    public List<Training> selectAllTrainings() {
//        return trainingService.selectAllTrainings();
//    }
//
//    public Training selectTrainingById(int id) {
//        return trainingService.selectTrainingById(id);
//    }
//
//    public void updateTraining(int id, Training updatedTraining) {
//        trainingService.updateTraining(id, updatedTraining);
//    }
//
//    public void createTrainee(Trainee trainee) {
//        traineeService.createTrainee(trainee);
//    }
//
//    public List<Trainee> selectAllTrainees() {
//        return traineeService.selectAllTrainees();
//    }
//
//    public Trainee selectTraineeById(int id) {
//        return traineeService.selectTraineeById(id);
//    }
//
//    public void updateTrainee(int id, Trainee updatedTrainee) {
//        traineeService.updateTrainee(id, updatedTrainee);
//    }
//
//    public Trainee selectTraineeByUserName(String userName) {
//        return traineeService.selectTraineeByUserName(userName);
//    }
//
//    public void updateTraineePassword(int id, String password) {
//        traineeService.changePassword(id, password);
//    }
//
//    public void activateTrainee(int id) {
//        traineeService.activateTrainee(id);
//    }
//
//    public void deactivateTrainee(int id) {
//        traineeService.deactivateTrainee(id);
//    }
//
//    public void deleteTraineeByUserName(String userName) {
//        traineeService.deleteTraineeByUserName(userName);
//    }
//
//    public void updateTraineeTrainerList(int updateTraineeId, Set<Trainer> trainers) {
//        traineeService.updateTraineeTrainerList(updateTraineeId, trainers);
//    }
//
//    public List<Training> selectTraineeTrainingListByTraineeUserNameAndCriteria(String userName, String criteria) {
//        return traineeService.selectTraineeTrainingListByTraineeUserNameAndCriteria(userName, criteria);
//    }
//
//    public void deleteTrainee(int id) {
//        traineeService.deleteTrainee(id);
//    }
//
//    public void createTrainer(Trainer trainer) {
//        trainerService.createTrainer(trainer);
//    }
//
//    public List<Trainer> selectAllTrainers() {
//        return trainerService.selectAllTrainers();
//    }
//
//    public Trainer selectTrainerById(int id) {
//        return trainerService.selectTrainerById(id);
//    }
//
//    public void deleteTrainerByUserName(String userName) {
//        trainerService.deleteTrainerByUserName(userName);
//    }
//
//    public void updateTrainer(int id, Trainer updatedTrainer) {
//        trainerService.updateTrainer(id, updatedTrainer);
//    }
//
//    public Trainer selectTrainerByUserName(String userName) {
//        return trainerService.selectTrainerByUserName(userName);
//    }
//
//    public void updateTrainerPassword(int id, String password) {
//        trainerService.updatePassword(id, password);
//    }
//
//    public void activateTrainer(int id) {
//        trainerService.activateTrainer(id);
//    }
//
//    public void deactivateTrainer(int id) {
//        trainerService.deactivateTrainer(id);
//    }
//
//    public List<Trainer> selectActiveTrainersList(int id) {
//        return trainerService.getActiveTrainersList(id);
//    }
//
//    public Trainer selectUserNameAndPasswordTrainer(String userName, String password) {
//        return trainerService.selectUserNameAndPassword(userName, password);
//    }
//
//    public List<Training> selectTrainerTrainingListByTrainerUserNameAndCriteria(String userName, String criteria) {
//        return trainerService.selectTrainerTrainingListByTrainerUserNameAndCriteria(userName, criteria);
//    }
//
//    public void createUser(User user) {
//        userService.createUser(user);
//    }
//
//    public List<User> selectAllUsers() {
//        return userService.selectAllUsers();
//    }
//
//    public User selectUserById(int id) {
//        return userService.selectUserById(id);
//    }
//
//    public void createSpecialization(Specialization specialization) {
//        specializationService.createSpecialization(specialization);
//    }
//
//    public List<Specialization> selectAllSpecializations() {
//        return specializationService.selectAllSpecializations();
//    }
//
//    public Specialization selectSpecializationById(int id) {
//        return specializationService.getSpecializationById(id);
//    }
//
//    public void updateSpecialization(int id, Specialization updatedSpecialization) {
//        specializationService.updateSpecialization(id, updatedSpecialization);
//    }
//
//    public Trainee selectUserNameAndPasswordTrainee(String userName, String password) {
//        return traineeService.selectUserNameAndPassword(userName, password);
//    }
//
//    public void createTrainingType(TrainingType trainingType) {
//        trainingTypeService.createTrainingType(trainingType);
//    }
//
//    public void updateTrainingType(int id, TrainingType updatedTraining) {
//        trainingTypeService.updateTrainingType(id, updatedTraining);
//    }
//
//    public List<User> usersUserNameAndPasswordGenerator() {
//        return passwordGeneratorService.selectAllUsersUserNameAndPassword();
//    }
//
//    public List<Trainer> trainersUserNameAndPasswordGenerator() {
//        return passwordGeneratorService.selectAllTrainersUserNameAndPassword();
//    }
//
//    public List<Trainee> traineesUserNameAndPasswordGenerator() {
//        return passwordGeneratorService.selectAllTraineesUserNameAndPassword();
//    }
//}
