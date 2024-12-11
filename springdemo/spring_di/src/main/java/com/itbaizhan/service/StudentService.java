package com.itbaizhan.service;

import com.itbaizhan.dao.StudentDao;
import com.itbaizhan.domain.Student;

public class StudentService {
    private StudentDao studentDao;

    public StudentService() {
    }

    public StudentService(StudentDao studentDao) {
        System.out.println("调用构造方法进行注入");
        this.studentDao = studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student findStudentById(int id) {
        return studentDao.findById(id);
    }
}
