package com.itbaizhan.dao;

import com.itbaizhan.domain.Student;
import org.springframework.stereotype.Repository;

// 此时bean的id为studentDao
//@Component("studentDao")
@Repository
public class StudentDaoImpl implements StudentDao{
    @Override
    public Student findById(int id) {
        // 模拟从数据库查找出学生
        return new Student(1,"百战程序员","北京");
    }
    
}
