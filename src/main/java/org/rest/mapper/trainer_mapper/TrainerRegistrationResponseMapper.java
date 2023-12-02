package org.rest.mapper.trainer_mapper;

import com.epam.xstack.model.dto.trainer.response.TrainerRegistrationResponseDTO;
import com.epam.xstack.model.entity.Trainer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TrainerRegistrationResponseMapper {
    TrainerRegistrationResponseDTO toDto(Trainer trainer);

    Trainer toEntity(TrainerRegistrationResponseDTO responseDTO);

    List<TrainerRegistrationResponseDTO> toDtos(List<Trainer> trainers);

    List<Trainer> toEntities(List<TrainerRegistrationResponseDTO> responseDTOS);
}
