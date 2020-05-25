package com.example.sonarqubesearch;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class UserRepositoryTest {

    //      ВСЕ ТЕСТЫ ЗДЕСЬ НА ПРОЦЕНТ ПОКРЫТИЯ НЕ ВЛИЯЮТ!!!

    @Autowired private DataSource dataSource;
    @Autowired private JdbcTemplate jdbcTemplate;
//    @Autowired private EntityManager entityManager;
    @Autowired private TestEntityManager entityManager;
    @Autowired private UserRepository userRepository;

    @Test
    void findByEmail() {
        // given
        User user = new User("user@mail.ru", "pass",
                LocalDateTime.of(2020, 01, 01, 11, 12, 13), true);
        entityManager.persist(user);
        entityManager.flush();

        // when
        User userDb = userRepository.findByEmail(user.getEmail());

        // then
        assertThat(userDb.getPassword()).isEqualTo(user.getPassword());
        assertThat(userDb.getLastLogon()).isEqualTo(user.getLastLogon());
        assertThat(userDb.isActive()).isEqualTo(user.isActive());
    }

    @Test
    void injectedComponentsAreNotNull(){
        assertThat(dataSource).isNotNull();
        assertThat(jdbcTemplate).isNotNull();
        assertThat(entityManager).isNotNull();
        assertThat(userRepository).isNotNull();
    }

}