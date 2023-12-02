package org.rest.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.model.entity.Trainee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GetTraineeProfileResponseMapper {
    GetTraineeProfileResponseDTO toDto(Trainee trainee);

    Trainee toEntity(GetTraineeProfileResponseDTO responseDTO);

    List<GetTraineeProfileResponseDTO> toDtos(List<Trainee> trainees);

    List<Trainee> toEntities(List<GetTraineeProfileResponseDTO> responseDTOS);
}
