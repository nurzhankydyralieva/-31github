package org.rest.service.authentication_service;

import com.epam.xstack.model.dto.authentication.AuthenticationChangeLoginRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationResponseDTO;


public interface AuthenticationService {

    AuthenticationResponseDTO authenticateLogin(Long id, AuthenticationRequestDTO requestDTO);
    AuthenticationResponseDTO authenticationChangeLogin(Long id, AuthenticationChangeLoginRequestDTO requestDTO);

}
