package org.rest.mapper.authentication_mapper;

import com.epam.xstack.model.dto.authentication.AuthenticationChangeLoginRequestDTO;
import com.epam.xstack.model.entity.Trainer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AuthenticationChangeLoginRequestMapper {
    @Mapping(target = "userName", source = "trainer.userName")
    @Mapping(target = "newPassword", source = "trainer.password")
    AuthenticationChangeLoginRequestDTO toDto(Trainer trainer);

    @InheritInverseConfiguration
    Trainer toEntity(AuthenticationChangeLoginRequestDTO requestDTO);
}
