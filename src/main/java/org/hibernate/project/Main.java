package org.hibernate.project;



import org.hibernate.project.config.SpringConfig;
import org.hibernate.project.dao.UserDAO;
import org.hibernate.project.models.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDAO userDAO = context.getBean(UserDAO.class);
        var user = User.builder().firstName("Maxim").lastName("Smith").userName("Tom").password("123").isActive(true).build();
        var updatedUser = User.builder().firstName("Katy").lastName("Simson").userName("Moon").password("123").isActive(true).build();

        userDAO.saveUser(user);
      //  userDAO.allUsers();
     //   userDAO.showUser(1);
      //  userDAO.updateUser(3, updatedUser);
       // userDAO.deleteUser(3);

    }
}
