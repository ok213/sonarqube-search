package com.example.sonarqubesearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class SonarqubeSearchApplicationTest {

    @Test
    void contextLoads() {

    }

    @Test
    void main() {
        SonarqubeSearchApplication.main(new String[] {});
        assertTrue(true);
    }
}