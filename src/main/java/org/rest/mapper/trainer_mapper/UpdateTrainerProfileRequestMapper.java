package org.rest.mapper.trainer_mapper;

import com.epam.xstack.model.dto.trainer.reuest.UpdateTrainerProfileRequestDTO;
import com.epam.xstack.model.entity.Trainer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UpdateTrainerProfileRequestMapper {
    UpdateTrainerProfileRequestDTO toDto(Trainer trainer);

    Trainer toEntity(UpdateTrainerProfileRequestDTO requestDTO);

    List<UpdateTrainerProfileRequestDTO> toDtos(List<Trainer> trainers);

    List<Trainer> toEntities(List<UpdateTrainerProfileRequestDTO> requestDTOS);
}
