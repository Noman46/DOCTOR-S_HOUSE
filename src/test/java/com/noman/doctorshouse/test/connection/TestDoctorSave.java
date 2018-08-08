/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.test.connection;

import com.noman.doctorshouse.config.SpringRootConfig;
import com.noman.doctorshouse.dao.DoctorDao;
import com.noman.doctorshouse.domain.Doctor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Noman Ibrahim
 */
public class TestDoctorSave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
       DoctorDao d= ctx.getBean(DoctorDao.class);
      
       Doctor t = new Doctor();
        
        t.setDoctorId("DC-1003");
        t.setName("Rabby");
        t.setPhone("0176284");
        t.setEmail("Hudai@yeahoo.com");
        t.setAddress("Barishal");
        t.setPassword("123");
        d.save(t);
        System.out.println("=====Done Successfully======");
        
        
    }
    
}
