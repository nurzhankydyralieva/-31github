package org.rest.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.reuest.TraineeRegistrationRequestDTO;
import com.epam.xstack.model.entity.Trainee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TraineeRegistrationRequestMapper {
    TraineeRegistrationRequestDTO toDto(Trainee trainee);

    Trainee toEntity(TraineeRegistrationRequestDTO requestDTO);

    List<TraineeRegistrationRequestDTO> toDtos(List<Trainee> trainees);

    List<Trainee> toEntities(List<TraineeRegistrationRequestDTO> requestDTOS);

}
