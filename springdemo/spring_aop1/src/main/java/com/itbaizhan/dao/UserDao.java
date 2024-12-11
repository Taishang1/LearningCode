package com.itbaizhan.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public int add(int a){
        System.out.println("用户新增");
        return 1;
    }
    public void delete(String a){
        System.out.println("用户删除");
    }

    public void update(){
        System.out.println("用户修改");
        int i = 1/0;
    }
}
