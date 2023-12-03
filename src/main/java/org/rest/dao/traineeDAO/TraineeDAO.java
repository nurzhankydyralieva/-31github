package org.rest.dao.traineeDAO;

import com.epam.xstack.model.dto.trainee.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.model.dto.trainee.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.model.dto.trainee.reuest.GetTraineeProfileRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.TraineeRegistrationRequestDTO;

public interface TraineeDAO {
    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);

   // Trainee selectTraineeProfileByUserName(Long id);
   GetTraineeProfileResponseDTO selectTraineeProfileByUserName(Long id,GetTraineeProfileRequestDTO requestDTO);
}
