package com.noman.doctorshouse.test.connection;


import com.noman.doctorshouse.config.SpringRootConfig;
import com.noman.doctorshouse.domain.Student;
import com.noman.doctorshouse.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Noman Ibrahim
 */
public class TestServiceLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        StudentService sr = ctx.getBean(StudentService.class);
        
        try {
            Student s=sr.login("IT-12001", "1234");
            System.err.println(s.getName());
        } catch (NullPointerException n) {
            System.out.println("Not found");
        }
    }

}
