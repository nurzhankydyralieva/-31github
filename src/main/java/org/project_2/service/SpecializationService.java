package org.project_2.service;

import com.example.project.dao.SpecializationDAO;
import com.example.project.entity.Specialization;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpecializationService {
    private final SpecializationDAO specializationDAO;

    public void createSpecialization(Specialization specialization){
        specializationDAO.createSpecialization(specialization);
    }
}
