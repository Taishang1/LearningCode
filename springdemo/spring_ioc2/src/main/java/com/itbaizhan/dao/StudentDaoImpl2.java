package com.itbaizhan.dao;

import com.itbaizhan.domain.Student;

public class StudentDaoImpl2 implements StudentDao{
    public StudentDaoImpl2(){
        System.out.println("创建了对象！！！");
    }
    @Override
    public Student findById(int id) {
        // 模拟从数据库查找出学生
        return new Student(1,"百战程序员","北京");
    }

    // 创建时自动执行的方法
    public void init(){
        System.out.println("创建StudentDao!!!");
    }

    // 销毁时自动执行的方法
    public void destroy(){
        System.out.println("销毁StudentDao!!!");
    }
}
