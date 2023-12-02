package org.rest.mapper.authentication_mapper;

import com.epam.xstack.model.dto.authentication.AuthenticationRequestDTO;
import com.epam.xstack.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthenticationRequestMapper {
    AuthenticationRequestDTO toDto(User user);

    User toEntity(AuthenticationRequestDTO requestDTO);
}