package com.itbaizhan.dao;

public class StudentDaoFactory {
    public StudentDao getStudentDao(){
        return new StudentDaoImpl(1);
    }
}
