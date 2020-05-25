package com.example.sonarqubesearch;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class UserRepositoryTest {

//    @Autowired private DataSource dataSource;
//    @Autowired private JdbcTemplate jdbcTemplate;
//    @Autowired private EntityManager entityManager;
//    @Autowired private UserRepository userRepository;

//    @Test
//    void injectedComponentsAreNotNull(){
//        assertThat(dataSource).isNotNull();
//        assertThat(jdbcTemplate).isNotNull();
//        assertThat(entityManager).isNotNull();
//        assertThat(userRepository).isNotNull();
//    }

//    @Test
//    void whenSaved_thenFindsByName() {
//        userRepository.save(new User("user@mail.ru", "password",
//                LocalDateTime.of(2020, 1, 1, 12, 13, 14), true));
//        assertThat(userRepository.findByEmail("user@mail.ru")).isNotNull();
//    }

}