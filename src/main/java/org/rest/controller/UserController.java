package org.rest.controller;

import org.rest.model.UserTest;
import org.rest.service.UserServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserServiceTest userService;

    @GetMapping("/users")
    public List<UserTest> showUsers() {
        List<UserTest> allUser = userService.getAllUser();
        return allUser;
    }
}
