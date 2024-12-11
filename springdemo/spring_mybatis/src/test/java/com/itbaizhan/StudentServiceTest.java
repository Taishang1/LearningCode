package com.itbaizhan;

import com.itbaizhan.domain.Student;
import com.itbaizhan.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

// JUnit使用Spring方式运行代码，即自动创建Spring容器
@RunWith(SpringJUnit4ClassRunner.class)
// 告知创建Spring容器时读取哪个配置文件
@ContextConfiguration(locations = "classpath:applicationContext.xml")
// 配置类写法
//@ContextConfiguration(classes = 配置类.class)
public class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void testFindAll(){
        List<Student> allStudent = studentService.findAllStudent();
        allStudent.forEach(System.out::println);
    }

    @Test
    public void testAdd(){
        Student student = new Student(0, "百战2", "男", "上海");
        studentService.addStudent(student);
    }

}
