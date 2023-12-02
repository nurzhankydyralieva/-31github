package org.rest.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.model.entity.Trainee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TraineeRegistrationResponseMapper {
    TraineeRegistrationResponseDTO toDto(Trainee trainee);
    Trainee toEntity(TraineeRegistrationResponseDTO responseDTO);
    List<TraineeRegistrationResponseDTO> toDtos(List<Trainee>trainees);
    List<Trainee> toEntities(List<TraineeRegistrationResponseDTO> responseDTOS);
}

