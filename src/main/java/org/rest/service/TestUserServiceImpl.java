package org.rest.service;


import org.rest.dao.UserDAOTest;
import org.rest.model.UserTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TestUserServiceImpl implements UserServiceTest {
    @Autowired
    private UserDAOTest userDAO;

    @Override
    @Transactional
    public List<UserTest> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    @Transactional
    public void saveUser(UserTest user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public UserTest getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
