package org.rest.mappers.trainer_mapper;

import com.epam.xstack.models.dto.trainer.request.TrainerRegistrationRequestDTO;
import com.epam.xstack.models.entity.Trainer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TrainerRegistrationRequestMapper {
    TrainerRegistrationRequestDTO toDto(Trainer trainer);

    Trainer toEntity(TrainerRegistrationRequestDTO requestDTO);

    List<TrainerRegistrationRequestDTO> toDtos(List<Trainer> trainers);

    List<Trainer> toEntities(List<TrainerRegistrationRequestDTO> requestDTOS);
}