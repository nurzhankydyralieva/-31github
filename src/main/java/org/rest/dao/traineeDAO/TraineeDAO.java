package org.rest.dao.traineeDAO;

import com.epam.xstack.model.dto.trainee.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.model.dto.trainee.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.model.dto.trainee.response.UpdateTraineeProfileResponseDTO;
import com.epam.xstack.model.dto.trainee.reuest.GetTraineeProfileRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.TraineeRegistrationRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.UpdateTraineeProfileRequestDTO;

public interface TraineeDAO {
    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);

    GetTraineeProfileResponseDTO selectTraineeProfileByUserName(Long id, GetTraineeProfileRequestDTO requestDTO);

    UpdateTraineeProfileResponseDTO updateTraineeProfile(Long id, UpdateTraineeProfileRequestDTO requestDTO);
}
