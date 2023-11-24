package org.project_2.service;

import com.example.project.dao.UserDAO;
import com.example.project.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDAO userDAO;

    public void createUser(User user) {
        userDAO.createUser(user);
    }
}
