/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.dao;

import com.noman.doctorshouse.domain.Prescription;
import java.util.List;

/**
 *
 * @author Noman Ibrahim
 */
public interface PrescriptionDao {
    public void save(Prescription pre);
    public Prescription findById(Integer preId);
    public List<Prescription> findAll(String studentId); 
}
