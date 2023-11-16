package org.password_create.project.facade;

import com.epam.project.model.Specialization;
import com.epam.project.model.User;
import com.epam.project.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ServiceFacade {

    private final ProfileService profileService;

    @Autowired
    public ServiceFacade(ProfileService profileService) {
        this.profileService = profileService;
    }

    public User traineeProfile(String firstName, String lastName, Date dateOfBirth, String address) {
        return profileService.createTraineeProfile(firstName, lastName, dateOfBirth, address);
    }

    public User trainerProfile(String firstName, String lastName, Specialization specialization) {
        return profileService.createTrainerProfile(firstName, lastName, specialization);
    }
}
