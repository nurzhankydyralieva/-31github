package org.rest.service;



import org.rest.model.UserTest;

import java.util.List;

public interface UserServiceTest {
    List<UserTest> getAllUser();

    void saveUser(UserTest user);

    public UserTest getUser(int id);

    void deleteUser(int id);
}
