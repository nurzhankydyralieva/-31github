package org.rest.service.authentication_service.impl;

import com.epam.xstack.dao.authenticationDAO.AuthenticationDAO;
import com.epam.xstack.model.dto.authentication.AuthenticationChangeLoginRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationResponseDTO;
import com.epam.xstack.service.authentication_service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final AuthenticationDAO authenticationDAO;

    @Override
    public AuthenticationResponseDTO authenticateLogin(Long id, AuthenticationRequestDTO requestDTO) {
        return authenticationDAO.authenticateLogin(id,requestDTO);
    }

    @Override
    public AuthenticationResponseDTO authenticationChangeLogin(Long id, AuthenticationChangeLoginRequestDTO requestDTO) {
      return   authenticationDAO.authenticationChangeLogin(id,requestDTO);
    }
}
