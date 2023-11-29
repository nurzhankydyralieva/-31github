package org.project_6.facade;

import com.example.project.entity.Specialization;

import java.util.List;

public interface SpecializationFacade {
    void createSpecialization(Specialization specialization);

    List<Specialization> selectAllSpecializations();

    Specialization selectSpecializationById(int id);

    void updateSpecialization(int id, Specialization updatedSpecialization);
}
