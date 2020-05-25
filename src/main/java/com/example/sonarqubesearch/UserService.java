package com.example.sonarqubesearch;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User getUserByEmail(String email);
    User saveUser(User user);
}
