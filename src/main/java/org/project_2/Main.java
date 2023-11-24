package org.project_2;


import com.example.project.config.SpringConfig;
import com.example.project.entity.Specialization;
import com.example.project.entity.Trainer;
import com.example.project.entity.User;
import com.example.project.facade.ServiceFacade;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ServiceFacade facade = context.getBean(ServiceFacade.class);

        var user = User.builder().firstName("Maxim").lastName("Smith").userName("Tom").password("123").isActive(true).build();
        var updatedUser = User.builder().firstName("Katy").lastName("Simson").userName("Moon").password("123").isActive(true).build();
        // facade.createUser(user);

        var specialization = Specialization.builder().speciality("Sports Analytics").build();
        //   facade.createSpecialization(specialization);

        var trainer = Trainer.builder().specialization(new Specialization(1)).user(new User(1)).build();
        facade.createTrainer(trainer);
        facade.selectAllTrainers().stream().forEach(System.out::println);



        context.close();
    }
}
