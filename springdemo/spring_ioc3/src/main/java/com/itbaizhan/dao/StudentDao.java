package com.itbaizhan.dao;

import com.itbaizhan.domain.Student;

public interface StudentDao {
    // 根据id查询学生
    Student findById(int id);
}
