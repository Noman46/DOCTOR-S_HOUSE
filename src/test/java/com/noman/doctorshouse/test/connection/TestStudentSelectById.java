/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.test.connection;

import com.noman.doctorshouse.config.SpringRootConfig;
import com.noman.doctorshouse.dao.StudentDao;
import com.noman.doctorshouse.domain.Student;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Noman Ibrahim
 */
public class TestStudentSelectById {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        StudentDao td = ctx.getBean(StudentDao.class);
        
        // Testing for findById method
        // Student s = td.findById("IT-12046");
        //System.out.println(s.toString());
        // Testing for findAll method
        //List<Student> t =  td.findAll();
        //System.out.println(t.toString());
        List<Student> t =  td.findByProperty("name", "Ibrahim");
        System.out.println(t.toString());
        
    }

}
