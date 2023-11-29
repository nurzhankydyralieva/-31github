package org.project_7.service;

import com.example.project.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectAllUsers();

    void createUser(User user);

    User selectUserById(int id);

    void updateUser(int id, User updatedUser);

    boolean deleteUser(int id);
}
