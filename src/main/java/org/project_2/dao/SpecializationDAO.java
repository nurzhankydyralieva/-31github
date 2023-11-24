package org.project_2.dao;

import com.example.project.entity.Specialization;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class SpecializationDAO {
    private final SessionFactory sessionFactory;

    @Transactional
    public void createSpecialization(Specialization specialization) {
        Session session = sessionFactory.getCurrentSession();
        Specialization speciality = new Specialization();
        speciality.setSpeciality(specialization.getSpeciality());
        session.save(speciality);
    }
}
