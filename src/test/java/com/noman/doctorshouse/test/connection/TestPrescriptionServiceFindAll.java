/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.test.connection;

import com.noman.doctorshouse.config.SpringRootConfig;
import com.noman.doctorshouse.domain.Prescription;
import com.noman.doctorshouse.service.PrescriptionService;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Noman Ibrahim
 */
public class TestPrescriptionServiceFindAll {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        PrescriptionService pre= ctx.getBean(PrescriptionService.class);

        List<Prescription> p = pre.findAllPrescriptions("IT-12046");
        System.out.println(p);
    }

}
