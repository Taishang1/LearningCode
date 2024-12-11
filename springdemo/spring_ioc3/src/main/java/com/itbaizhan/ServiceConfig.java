package com.itbaizhan;

import com.itbaizhan.dao.StudentDao;
import com.itbaizhan.service.StudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public StudentService getStudentService(@Qualifier("studentDaoImpl2") StudentDao studentDao){
        System.out.println(studentDao);
        return new StudentService();
    }
}
