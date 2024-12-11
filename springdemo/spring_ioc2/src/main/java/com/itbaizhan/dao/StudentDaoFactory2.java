package com.itbaizhan.dao;

public class StudentDaoFactory2 {
    public static StudentDao getStudentDao(){
        return new StudentDaoImpl(1);
    }
}
