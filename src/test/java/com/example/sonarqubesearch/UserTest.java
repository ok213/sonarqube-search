package com.example.sonarqubesearch;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

//    @Test
//    void createUserWithConstructors() {
//        User user = new User(1L, "user@mail.ru", "pass",
//                LocalDateTime.of(2020, 01, 01, 11, 12, 13), true);
//        User userWithoutId = new User("user@mail.ru", "pass",
//                LocalDateTime.of(2020, 01, 01, 11, 12, 13), true);
//        assertTrue(true);
//    }

    // @Data
//    @Test
//    void settersAndGetters() {
//        User user = new User();
//        user.setId(1L);
//        user.setEmail("user@mail.ru");
//        user.setPassword("pass");
//        user.setLastLogon(LocalDateTime.of(2020, 01, 01, 11, 12, 13));
//        user.setActive(true);
//
//        assertEquals(user.getId(), 1L);
//        assertEquals(user.getEmail(), "user@mail.ru");
//        assertEquals(user.getPassword(), "pass");
//        assertEquals(user.getLastLogon(), LocalDateTime.of(2020, 01, 01, 11, 12, 13));
//        assertEquals(user.isActive(), true);
//    }

//    @Test
//    void equals() {
//        User user1 = new User(1L, "user@mail.ru", "user", LocalDateTime.of(2020, 01, 01, 11, 12, 13), true);
//        User user2 = new User(1L, "user@mail.ru", "user", LocalDateTime.of(2020, 01, 01, 11, 12, 13), true);
//        assertEquals(user1, user2);
//    }

//    @Test
//    void checkHashCode() {
//        User user1 = new User(1L, "user@mail.ru", "user", LocalDateTime.of(2020, 01, 01, 11, 12, 13), true);
//        User user2 = new User(1L, "user@mail.ru", "user", LocalDateTime.of(2020, 01, 01, 11, 12, 13), true);
//        User user3 = new User(2L, "user@mail.ru", "user", LocalDateTime.of(2020, 01, 01, 11, 12, 13), true);
//
//        assertEquals(user1.hashCode(), user2.hashCode());
//        assertNotEquals(user1.hashCode(), user3.hashCode());
//    }

    @Test
    void getStatus_methodWithIF() {
        User user1 = new User(1L, "user@mail.ru", "user", LocalDateTime.of(2020, 01, 01, 11, 12, 13), true);
        User user2 = new User(1L, "user@mail.ru", "user", LocalDateTime.of(2020, 01, 01, 11, 12, 13), false);

        assertEquals(user1.getStatus(), "User is active.");
        assertEquals(user2.getStatus(), "User is not active.");
    }

    @Test
    void getStringNumber_methodWithSWITCH() {
        User user1 = new User(1L, "user@mail.ru", "user", LocalDateTime.of(2020, 01, 01, 11, 12, 13), true);

        assertEquals(user1.getStringNumber(1), "One");
        assertEquals(user1.getStringNumber(2), "Two");
        assertEquals(user1.getStringNumber(11), "Unknow");
    }

}