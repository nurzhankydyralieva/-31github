package org.project_7.service;

import com.example.project.entity.Specialization;

import java.util.List;

public interface SpecializationService {
    List<Specialization> selectAllSpecializations();

    void createSpecialization(Specialization specialization);

    Specialization getSpecializationById(int id);

    void updateSpecialization(int id, Specialization updatedSpecialization);
}
