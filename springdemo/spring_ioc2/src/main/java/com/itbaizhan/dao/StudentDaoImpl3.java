package com.itbaizhan.dao;

import com.itbaizhan.domain.Student;

public class StudentDaoImpl3 implements StudentDao{
    @Override
    public Student findById(int id) {
        // 模拟从数据库查找出学生
        return new Student(1,"百战程序员","北京");
    }
}
