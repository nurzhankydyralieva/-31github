package org.rest.dao;



import org.rest.model.UserTest;

import java.util.List;

public interface UserDAOTest {
    List<UserTest> getAllUser();

    void saveUser(UserTest user);

    public UserTest getUser(int id);

    void deleteUser(int id);
}
