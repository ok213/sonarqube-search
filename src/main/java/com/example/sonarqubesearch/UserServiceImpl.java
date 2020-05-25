package com.example.sonarqubesearch;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
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
        return user;
    }

    @Override
    public User saveUser(User user) {
        String pass = user.getPassword();
        if ("".equals(pass)) {
            user.setPassword("12345678");
        }
        return userRepository.save(user);
    }

}
