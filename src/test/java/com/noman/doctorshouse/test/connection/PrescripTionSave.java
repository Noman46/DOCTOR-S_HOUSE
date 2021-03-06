/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.test.connection;

import com.noman.doctorshouse.config.SpringRootConfig;
import com.noman.doctorshouse.dao.PrescriptionDao;
import com.noman.doctorshouse.domain.Prescription;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Noman Ibrahim
 */
public class PrescripTionSave {

    
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        PrescriptionDao pre = ctx.getBean(PrescriptionDao.class);
        
        Prescription p = new Prescription();
        p.setDoctorId("DC-1003");
        p.setStudentId("IT-12046");
        p.setStudentName("Ibrahim");
        p.setAge(25);
        p.setDisease("Back Pain");
        p.setMedicine("Anthropeck");
        p.setStrength("500mg, 300mg");
        p.setRoute("Mouth");
        p.setFrequency("twice in a day");
        p.setStartDate("6/4/7");
        p.setEndDate("10/3/5");
        p.setRemarks("Sleep well, Dont bend while doing work");
        
        pre.save(p);
        System.out.println("=====Done Successfully======");
    }
    
}
