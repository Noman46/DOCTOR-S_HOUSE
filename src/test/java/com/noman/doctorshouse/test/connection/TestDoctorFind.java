/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.test.connection;

import com.noman.doctorshouse.config.SpringRootConfig;
import com.noman.doctorshouse.dao.DoctorDao;
import com.noman.doctorshouse.domain.Doctor;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Noman Ibrahim
 */
public class TestDoctorFind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
       DoctorDao d= ctx.getBean(DoctorDao.class);
      
       //Doctor dd = d.findById("DC-1001");
       //System.out.println(dd.toString());
       
       //List<Doctor> dd = d.findAll();
       //System.out.println(dd.toString());
       
       List<Doctor> dd = d.findByProperty("name", "Khadem");
       System.out.println(dd.toString());
       
       
        
        
    }
    
}
