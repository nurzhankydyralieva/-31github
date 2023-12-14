package org.test;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class TraineeTestDAO {

    private final SessionFactory sessionFactory;


    public List<TraineeTest> getAllTrainees() {
        Session session = sessionFactory.getCurrentSession();
        List fromTraineeTest = session.createQuery("FROM TraineeTest").list();
        return fromTraineeTest;
    }

    public TraineeTest getTrainee(UUID id) {
        Session session = sessionFactory.getCurrentSession();
        TraineeTest trainee = session.load(TraineeTest.class, id);
        return trainee;
    }

    public TraineeTest addTrainee(TraineeTest test) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(test);
        return test;
    }

    public void updateTrainee(TraineeTest test) {
        Session session = sessionFactory.getCurrentSession();
        session.update(test);
    }

    public void deleteTrainee(UUID id) {
        Session session =sessionFactory.getCurrentSession();
        TraineeTest traineeTest = session.load(TraineeTest.class, id);
        if (traineeTest != null) {
            session.delete(traineeTest);
        }
    }
}
