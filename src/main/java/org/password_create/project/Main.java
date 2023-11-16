package org.password_create.project;

import com.epam.project.config.AppConfig;
import com.epam.project.facade.ServiceFacade;
import com.epam.project.model.Specialization;
import com.epam.project.model.User;
import com.epam.project.storage.Storage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Storage storage = context.getBean(Storage.class);
        ServiceFacade facade = context.getBean(ServiceFacade.class);


        // Create a trainee profile
        User traineeUser = facade.traineeProfile("Andrea", "Bocelli", new Date(), "1575 Evergreen Ave");
        System.out.println("Trainee UserName: " + traineeUser.getUserName());
        System.out.println("Trainee Password: " + traineeUser.getPassword());
        // Create a trainer profile
        User trainerUser = facade.trainerProfile("Maxim", "Gordon", new Specialization());
        System.out.println("Trainer UserName: " + trainerUser.getUserName());
        System.out.println("Trainer Password: " + trainerUser.getPassword());



        context.close();
    }
}
