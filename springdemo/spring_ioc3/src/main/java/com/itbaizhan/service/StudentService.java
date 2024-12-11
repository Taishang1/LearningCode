package com.itbaizhan.service;

import com.itbaizhan.dao.StudentDao;
import com.itbaizhan.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//@Service
//@Scope("prototype")
public class StudentService {
    @Autowired
    @Qualifier("studentDaoImpl")
    private StudentDao studentDao;

    @Value("1")
    private int count;

    @Value("hello")
    private String str;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Override
    public String toString() {
        return "StudentService{" +
                "studentDao=" + studentDao +
                ", count=" + count +
                ", str='" + str + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    //    public StudentService() {
//    }
//
//    @Autowired
//    public StudentService(StudentDao studentDao) {
//        System.out.println("调用构造方法进行注入");
//        this.studentDao = studentDao;
//    }
//
////    @Autowired
//    public void setStudentDao(StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public Student findStudentById(int id) {
        return studentDao.findById(id);
    }
}
