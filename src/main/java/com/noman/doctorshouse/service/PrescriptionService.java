/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.service;

import com.noman.doctorshouse.domain.Prescription;
import java.util.List;

/**
 *
 * @author Noman Ibrahim
 */
public interface PrescriptionService {
    public void prescriptionSave(Prescription p);
    public Prescription findById(String studentId);
    public List<Prescription> findAllPrescriptions(String studentId); 
    
}
