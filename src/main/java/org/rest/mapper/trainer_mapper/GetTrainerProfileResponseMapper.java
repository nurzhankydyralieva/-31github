package org.rest.mapper.trainer_mapper;

import com.epam.xstack.model.dto.trainer.response.GetTrainerProfileResponseDTO;
import com.epam.xstack.model.entity.Trainer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GetTrainerProfileResponseMapper {
    GetTrainerProfileResponseDTO toDto(Trainer trainer);

    Trainer toEntity(GetTrainerProfileResponseDTO responseDTO);

    List<GetTrainerProfileResponseDTO> toDtos(List<Trainer> trainers);

    List<Trainer> toEntities(List<GetTrainerProfileResponseDTO> responseDTOS);
}
