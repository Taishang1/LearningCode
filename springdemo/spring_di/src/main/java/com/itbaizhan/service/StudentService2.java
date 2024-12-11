package com.itbaizhan.service;

import com.itbaizhan.dao.StudentDao;
import com.itbaizhan.domain.Student;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StudentService2 {
    private StudentDao studentDao; // bean属性
    private String name; //字符串类型
    private int count; //基本数据类型
    private List<String> names; // 字符串类型List集合
    private List<Student> students1; // 对象类型List集合
    private Set<Student> students2; // 对象类型Set集合
    private Map<String,String> names2; // 字符串类型Map集合
    private Map<String,Student> students3; // 对象类型Map集合
    private Properties properties; //Properties类型


    // 省略getter/setter/toString
    @Override
    public String toString() {
        return "StudentService2{" +
                "studentDao=" + studentDao +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", names=" + names +
                ", students1=" + students1 +
                ", students2=" + students2 +
                ", names2=" + names2 +
                ", students3=" + students3 +
                ", properties=" + properties +
                '}';
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<Student> getStudents1() {
        return students1;
    }

    public void setStudents1(List<Student> students1) {
        this.students1 = students1;
    }

    public Set<Student> getStudents2() {
        return students2;
    }

    public void setStudents2(Set<Student> students2) {
        this.students2 = students2;
    }

    public Map<String, String> getNames2() {
        return names2;
    }

    public void setNames2(Map<String, String> names2) {
        this.names2 = names2;
    }

    public Map<String, Student> getStudents3() {
        return students3;
    }

    public void setStudents3(Map<String, Student> students3) {
        this.students3 = students3;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}