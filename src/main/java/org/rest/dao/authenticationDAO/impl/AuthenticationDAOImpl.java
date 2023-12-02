package org.rest.dao.authenticationDAO.impl;

import com.epam.xstack.dao.authenticationDAO.AuthenticationDAO;
import com.epam.xstack.dao.traineeDAO.TraineeDAO;
import com.epam.xstack.mapper.authentication_mapper.AuthenticationRequestMapper;
import com.epam.xstack.model.dto.authentication.AuthenticationRequestDTO;
import com.epam.xstack.model.entity.User;
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


    @Override
    @Transactional
    public AuthenticationRequestDTO authenticate(Long id, AuthenticationRequestDTO requestDTO) {

        Session session = sessionFactory.getCurrentSession();

        User user = session.get(User.class, id);
        if (user.getId() != null) {
            User fromDatabase = mapper.toEntity(requestDTO);
            session.get(User.class, fromDatabase.getUserName());
            session.get(User.class, fromDatabase.getPassword());
            requestDTO = mapper.toDto(fromDatabase);
        }
        return requestDTO;
    }

}
