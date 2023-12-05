package org.rest.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.reuest.GetTraineeProfileRequestDTO;
import com.epam.xstack.model.entity.Trainee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GetTraineeProfileRequestMapper {
    GetTraineeProfileRequestDTO toDto(Trainee trainee);

    Trainee toEntity(GetTraineeProfileRequestDTO requestDTO);

    List<GetTraineeProfileRequestDTO> toDtos(List<Trainee> trainees);

    List<Trainee> toEntities(List<GetTraineeProfileRequestDTO> requestDTOS);
}