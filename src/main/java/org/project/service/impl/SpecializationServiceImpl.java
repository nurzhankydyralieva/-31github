package org.project.service.impl;

import com.example.project.dao.SpecializationDAO;
import com.example.project.entity.Specialization;
import com.example.project.service.SpecializationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpecializationServiceImpl implements SpecializationService {
    private final SpecializationDAO specializationDAO;

    @Override
    public List<Specialization> selectAllSpecializations() {
        return specializationDAO.selectAllSpecializations();
    }

    @Override
    public void createSpecialization(Specialization specialization) {
        specializationDAO.createSpecialization(specialization);
    }

    @Override
    public Specialization getSpecializationById(int id) {
        return specializationDAO.showSpecializationById(id);
    }

    @Override
    public void updateSpecialization(int id, Specialization updatedSpecialization) {
        specializationDAO.updateSpecialization(id, updatedSpecialization);
    }
}
