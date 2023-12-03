package org.rest.dao.authenticationDAO.impl;

import com.epam.xstack.dao.authenticationDAO.AuthenticationDAO;
import com.epam.xstack.dao.traineeDAO.TraineeDAO;
import com.epam.xstack.mapper.authentication_mapper.AuthenticationChangeLoginRequestMapper;
import com.epam.xstack.mapper.authentication_mapper.AuthenticationRequestMapper;
import com.epam.xstack.model.dto.authentication.AuthenticationChangeLoginRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationResponseDTO;
import com.epam.xstack.model.entity.Trainer;
import com.epam.xstack.model.entity.User;
import com.epam.xstack.model.enums.Code;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class AuthenticationDAOImpl implements AuthenticationDAO {
    private static final Logger LOGGER = LoggerFactory.getLogger(TraineeDAO.class);
    private final SessionFactory sessionFactory;
    private final AuthenticationRequestMapper mapper;
    private final AuthenticationChangeLoginRequestMapper loginMapper;

    @Override
    @Transactional
    public AuthenticationResponseDTO authenticateLogin(Long id, AuthenticationRequestDTO requestDTO) {
        Session session = sessionFactory.getCurrentSession();
        User user = mapper.toEntity(requestDTO);
        User userId = session.get(User.class, id);

        if (userId.getUserName().equals(user.getUserName()) && userId.getPassword().equals(user.getPassword())) {
            mapper.toDto(user);
            return AuthenticationResponseDTO
                    .builder()
                    .response("Login response")
                    .code(Code.STATUS_200_OK)
                    .build();
        } else {
            throw new RuntimeException("Not available");
        }
    }

    @Override
    @Transactional
    public AuthenticationResponseDTO authenticationChangeLogin(Long id, AuthenticationChangeLoginRequestDTO requestDTO) {
        Session session = sessionFactory.getCurrentSession();
        Trainer trainerToBeUpdated = session.get(Trainer.class, id);

        trainerToBeUpdated.setUserName(requestDTO.getUserName());
        trainerToBeUpdated.setPassword(requestDTO.getNewPassword());
        return AuthenticationResponseDTO
                .builder()
                .response("Login response")
                .code(Code.STATUS_200_OK)
                .build();
    }
}
