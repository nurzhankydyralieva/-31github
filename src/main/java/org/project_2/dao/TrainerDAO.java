package org.project_2.dao;

import com.example.project.entity.Trainer;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TrainerDAO {
    private final SessionFactory sessionFactory;

    @Transactional(readOnly = true)
    public List<Trainer> selectAllTrainers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("SELECT t FROM Trainer t", Trainer.class).getResultList();
    }


    @Transactional
    public void createTrainer(Trainer trainer) {
        Session session = sessionFactory.getCurrentSession();
        Trainer saveTrainer = new Trainer();
        saveTrainer.setSpecialization(trainer.getSpecialization());
        saveTrainer.setUser(trainer.getUser());
        session.save(trainer);
    }

}
