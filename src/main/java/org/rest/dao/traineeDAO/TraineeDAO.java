package org.rest.dao.traineeDAO;

import com.epam.xstack.model.dto.trainee.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.model.dto.trainee.reuest.TraineeRegistrationRequestDTO;

public interface TraineeDAO {

    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);
}
