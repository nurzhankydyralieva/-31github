package org.rest.mapper.trainee_mapper;

import com.epam.xstack.model.dto.trainee.reuest.UpdateTrainee_sTrainerListRequestDTO;
import com.epam.xstack.model.entity.Trainee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UpdateTrainee_sTrainerListRequestMapper {

//    @Mapping(target = "traineeUserName", source = "trainee.userName")
//    @Mapping(target = "trainers", source = "trainee.trainers")
    UpdateTrainee_sTrainerListRequestDTO toDto(Trainee trainee);

//    @InheritInverseConfiguration
    Trainee toEntity(UpdateTrainee_sTrainerListRequestDTO requestDTO);
}
