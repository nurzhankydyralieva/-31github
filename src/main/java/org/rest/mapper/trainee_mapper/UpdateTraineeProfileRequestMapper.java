package org.rest.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.reuest.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.model.entity.Trainee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UpdateTraineeProfileRequestMapper {
    UpdateTraineeProfileRequestDTO toDto(Trainee trainee);

    Trainee toEntity(UpdateTraineeProfileRequestDTO requestDTO);

    List<UpdateTraineeProfileRequestDTO> toDtos(List<Trainee> trainees);

    List<Trainee> toEntities(List<UpdateTraineeProfileRequestDTO> requestDTOS);
}
