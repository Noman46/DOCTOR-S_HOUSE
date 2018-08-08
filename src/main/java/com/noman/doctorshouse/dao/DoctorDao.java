/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.dao;

import com.noman.doctorshouse.domain.Doctor;
import java.util.List;

/**
 *
 * @author Noman Ibrahim
 */
public interface DoctorDao {

    public void save(Doctor doc);

    public void update(Doctor doc);

    public void delete(Doctor doc);

    public void delete(String doctortId);

    public Doctor findById(String doctorId);

    public List<Doctor> findAll();

    public List<Doctor> findByProperty(String propName, Object propValue);

    public List<Doctor> orderByPriority(String propName, Object propValue);
}
