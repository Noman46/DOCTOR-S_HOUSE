package com.noman.doctorshouse.service;

import com.noman.doctorshouse.domain.Doctor;
import java.util.List;

/**
 *
 * @author Noman Ibrahim
 */
public interface DoctorService {

    public void save(Doctor d);

    public void update(Doctor d);

    public void delete(String doctorId);

    public Doctor findById(String doctorId);

   
}
