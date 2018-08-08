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
public class TestServiceRegistration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
      StudentService sr= ctx.getBean(StudentService.class);
      Student s = new Student();
      s.setStudentId("IT-12001");
      s.setName("Imon");
      s.setPhone("01722717283");
      s.setEmail("imon@gmail.com");
      s.setAddress("Savar");
      s.setDept("BG");
      s.setSession("2016-2017");
      s.setPassword("1234");
      sr.register(s);
        System.out.println("The student is daved");      
    }
    
}
