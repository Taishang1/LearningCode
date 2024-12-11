package com.itbaizhan.service;

import com.itbaizhan.Container;
import com.itbaizhan.dao.StudentDao;
import com.itbaizhan.domain.Student;

public class StudentService {
    public Student findStudentById(int id){
        StudentDao studentDao = (StudentDao) Container.getBean("studentDao");
        System.out.println(studentDao.hashCode());
        return studentDao.findById(id);
    }
}
