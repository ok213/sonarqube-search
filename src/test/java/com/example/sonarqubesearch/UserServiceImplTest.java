package com.example.sonarqubesearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Test
    void getAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "user1@mail.ru", "pass1",
                LocalDateTime.of(2018, 1, 1, 1, 1, 1), true));
        users.add(new User(2L, "user2@mail.ru", "pass2",
                LocalDateTime.of(2019, 2, 2, 2, 2, 2), false));
        users.add(new User(3L, "user3@mail.ru", "pass3",
                LocalDateTime.of(2020, 3, 3, 3, 3, 3), true));
        userRepository.saveAll(users);
        userRepository.flush();

        List<User> expected = userService.getAllUsers();
        assertEquals(expected, users);
    }

    @Test
    void getUserByEmail() {
        final User user = new User("user4@mail.ru", "password",
                LocalDateTime.of(2020, 1, 1, 10, 11, 12), true);
        userRepository.save(user);
        userRepository.flush();

        final User expected = userService.getUserByEmail("user4@mail.ru");
        assertEquals(expected, user);
    }

    @Test
    void saveUser() {
        User savedUser = userService.saveUser(new User("user5@mail.ru", "password",
                LocalDateTime.of(2020, 1, 1, 10, 11, 12), true));

        final User expected = userRepository.findByEmail("user5@mail.ru");
        assertEquals(expected, savedUser);
    }

    @Test
    void saveUserWithEmptyPassword() {
        User savedUser = userService.saveUser(new User("user6@mail.ru", "",
                LocalDateTime.of(2020, 1, 1, 10, 11, 12), true));
        savedUser.setPassword("12345678");

        final User expected = userRepository.findByEmail("user6@mail.ru");
        assertEquals(expected, savedUser);
    }

}