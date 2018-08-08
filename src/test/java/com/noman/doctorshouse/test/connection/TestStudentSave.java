/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.test.connection;

import com.noman.doctorshouse.config.SpringRootConfig;
import com.noman.doctorshouse.dao.StudentDao;
import com.noman.doctorshouse.domain.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Noman Ibrahim
 */
public class TestStudentSave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
       StudentDao td = ctx.getBean(StudentDao.class);
      
       Student t = new Student();
        
        t.setStudentId("IT-12030");
        t.setName("KE jani ke");
        t.setPhone("29871298");
        t.setEmail("Kemne@yeahoo.com");
        t.setAddress("Dhaka");
        t.setDept("CSE");
        t.setSession("2011-2012");
        t.setPassword("123");
        td.update(t);
        System.out.println("=====Done Successfully======");
        
        
    }
    
}
