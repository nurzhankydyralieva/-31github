package org.rest.mapper.trainer_mapper;

import com.epam.xstack.model.dto.trainer.response.UpdateTrainerProfileResponseDTO;
import com.epam.xstack.model.entity.Trainer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UpdateTrainerProfileResponseMapper {
    UpdateTrainerProfileResponseDTO toDto(Trainer trainer);

    Trainer toEntity(UpdateTrainerProfileResponseDTO responseDTO);

    List<UpdateTrainerProfileResponseDTO> toDtos(List<Trainer> trainers);

    List<Trainer> toEntities(List<UpdateTrainerProfileResponseDTO> responseDTOS);
}
