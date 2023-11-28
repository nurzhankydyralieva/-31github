package org.project.facade.impl;

import com.example.project.entity.Specialization;
import com.example.project.facade.SpecializationFacade;
import com.example.project.service.impl.SpecializationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SpecializationFacadeImpl implements SpecializationFacade {
    private final SpecializationServiceImpl specializationService;

    @Override
    public void createSpecialization(Specialization specialization) {
        specializationService.createSpecialization(specialization);
    }

    @Override
    public List<Specialization> selectAllSpecializations() {
        return specializationService.selectAllSpecializations();
    }

    @Override
    public Specialization selectSpecializationById(int id) {
        return specializationService.getSpecializationById(id);
    }

    @Override
    public void updateSpecialization(int id, Specialization updatedSpecialization) {
        specializationService.updateSpecialization(id, updatedSpecialization);
    }
}
