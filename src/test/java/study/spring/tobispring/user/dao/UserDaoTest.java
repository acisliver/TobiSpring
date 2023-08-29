package study.spring.tobispring.user.dao;

import org.junit.jupiter.api.Test;
import study.spring.tobispring.user.domain.User;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

class UserDaoTest {

    @Test
    void test() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();

        User user = new User();
        user.setId("acisliver");
        user.setName("고대은");
        user.setPassword("password");

        userDao.add(user);
        User savedUser = userDao.get(user.getId());

        assertThat(savedUser.getId()).isEqualTo(user.getId());
        assertThat(savedUser.getName()).isEqualTo(user.getName());
        assertThat(savedUser.getPassword()).isEqualTo(user.getPassword());
    }
}
