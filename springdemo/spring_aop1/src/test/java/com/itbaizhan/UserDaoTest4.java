package com.itbaizhan;

import com.itbaizhan.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext3.xml")
public class UserDaoTest4 {
    @Autowired
    @Qualifier("userDaoProxy")
    private UserDao userDao;

    @Test
    public void testAdd(){
        userDao.add(1);
    }

}
