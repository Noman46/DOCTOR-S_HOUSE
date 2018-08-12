/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.service;

import com.noman.doctorshouse.dao.PrescriptionDao;
import com.noman.doctorshouse.domain.Prescription;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noman Ibrahim
 */

@Service
public class PrescriptionServiceImpl implements PrescriptionService{

    @Autowired
    private PrescriptionDao prescriptionDao;
    
    
    @Override
    public void prescriptionSave(Prescription p) {
    
    prescriptionDao.save(p);
    }
    
    @Override
    public Prescription findById(String studentId) {
        Prescription p=prescriptionDao.findById(studentId);
        return p;
    }

    @Override
    public List<Prescription> findAllPrescriptions(String studentId) {
     
        List<Prescription> p = prescriptionDao.findAll(studentId);
        return p;
    
    }
    
}
