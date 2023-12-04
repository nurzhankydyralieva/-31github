package org.rest.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.response.UpdateTraineeProfileResponseDTO;
import com.epam.xstack.model.entity.Trainee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UpdateTraineeProfileResponseMapper {
    UpdateTraineeProfileResponseDTO toDto(Trainee trainee);

    Trainee toEntity(UpdateTraineeProfileResponseDTO responseDTO);

    List<UpdateTraineeProfileResponseDTO> toDtos(List<Trainee> trainees);

    List<Trainee> toEntities(List<UpdateTraineeProfileResponseDTO> responseDTOS);
}
