package com.example.sonarqubesearch;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        for (int i = 0; i < 5; i++) {
            // do something
        }
        return users;
    }

    @Override
    public User getUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
        if (email.equals("unknow")) {
            // do something
        } else {
            // do something
        }
        return user;
    }

    @Override
    public User saveUser(User user) {
        User userDb = userRepository.findByEmail(user.getEmail());
        if (userDb == null) {
            return userRepository.save(user);
        }
        return userDb;
    }
}
