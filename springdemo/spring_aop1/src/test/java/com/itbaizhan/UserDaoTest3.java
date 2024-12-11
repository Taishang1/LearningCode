package com.itbaizhan;

import com.itbaizhan.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserDaoTest3 {
    @Autowired
    private UserDao userDao;

    @Test
    public void testAdd(){
        userDao.add(1);
    }

    @Test
    public void testDelete(){
        userDao.delete("1");
    }

    @Test
    public void testUpdate(){
        userDao.update();
    }
}
