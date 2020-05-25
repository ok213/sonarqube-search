package com.example.sonarqubesearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

//    @Mock
//    private UserRepository userRepository;
//
//    @InjectMocks
//    private UserService userService;

//    @Test
//    void getAllUsers() {
//        List<User> users = new ArrayList<>();
//        users.add(new User(1L, "user1@mail.ru", "pass1", LocalDateTime.of(2018, 1, 1, 1, 1, 1), true));
//        users.add(new User(2L, "user2@mail.ru", "pass2", LocalDateTime.of(2019, 2, 2, 2, 2, 2), false));
//        users.add(new User(3L, "user3@mail.ru", "pass3", LocalDateTime.of(2020, 3, 3, 3, 3, 3), true));
//        given(userRepository.findAll()).willReturn(users);
//        List<User> expected = userService.getAllUsers();
//        assertEquals(expected, users);
//    }

//    @Test
//    void getUserByEmail() {
//        final User user = new User("user@mail.ru", "password",
//                LocalDateTime.of(2020, 1, 1, 10, 11, 12), true);
//        given(userRepository.findByEmail(user.getEmail())).willReturn(user);
//        final User expected = userService.getUserByEmail("user@mail.ru");
//        assertThat(expected).isNotNull();
//    }

//    @Test
//    void saveUser() {
//        final User user = new User(null, "user@mail.ru", "password",
//                LocalDateTime.of(2020, 1, 1, 10, 11, 12), true);
//
//        given(userRepository.findByEmail(user.getEmail())).willReturn(user);
//        given(userRepository.save(user)).willAnswer(invocation -> invocation.getArgument(0));
//
//        User savedUser = userService.saveUser(user);
//        assertThat(savedUser).isNotNull();
//        verify(userRepository).save(any(User.class));
//
//    }

}