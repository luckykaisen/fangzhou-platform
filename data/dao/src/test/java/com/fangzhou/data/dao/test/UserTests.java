package com.fangzhou.data.dao.test;

import com.fangzhou.platform.data.dao.bean.User;
import com.fangzhou.platform.data.dao.impl.core.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
@TestPropertySource(locations = "classpath:application.yml")
public class UserTests {

    @Autowired
   private UserDao userDao;

    @Test
    public void testSelectUserByMobile() {

        User user = userDao.selectUserByMobile("123");

        System.out.println(user);

    }
}
