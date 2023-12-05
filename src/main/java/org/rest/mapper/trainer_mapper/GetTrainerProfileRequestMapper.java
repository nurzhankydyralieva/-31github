package org.rest.mapper.trainer_mapper;

import com.epam.xstack.model.dto.trainer.reuest.GetTrainerProfileRequestDTO;
import com.epam.xstack.model.entity.Trainer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GetTrainerProfileRequestMapper {
    GetTrainerProfileRequestDTO toDto(Trainer trainer);

    Trainer toEntity(GetTrainerProfileRequestDTO requestDTO);

    List<GetTrainerProfileRequestDTO> toDtos(List<Trainer> trainers);

    List<Trainer> toEntities(List<GetTrainerProfileRequestDTO> requestDTOS);
}