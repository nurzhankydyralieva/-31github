package org.rest.dao.authenticationDAO;

import com.epam.xstack.model.dto.authentication.AuthenticationRequestDTO;

public interface AuthenticationDAO {
    AuthenticationRequestDTO authenticate(Long id, AuthenticationRequestDTO requestDTO);

    //AuthenticationRequestDTO getById(Long id, AuthenticationRequestDTO requestDTO);
}
