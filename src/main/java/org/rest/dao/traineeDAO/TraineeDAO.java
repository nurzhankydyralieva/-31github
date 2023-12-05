package org.rest.dao.traineeDAO;

import com.epam.xstack.model.dto.trainee.response.*;
import com.epam.xstack.model.dto.trainee.reuest.GetTraineeProfileRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.TraineeRegistrationRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.UpdateTrainee_sTrainerListRequestDTO;

public interface TraineeDAO {
    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);

    GetTraineeProfileResponseDTO selectTraineeProfileByUserName(Long id, GetTraineeProfileRequestDTO requestDTO);

    UpdateTraineeProfileResponseDTO updateTraineeProfile(Long id, UpdateTraineeProfileRequestDTO requestDTO);

    DeleteResponseDTO deleteTraineeByUserName(Long id, GetTraineeProfileRequestDTO requestDTO);
    UpdateTrainee_sTrainerListResponseDTO updateTrainee_sTrainerList(Long id, UpdateTrainee_sTrainerListRequestDTO requestDTO);

}
