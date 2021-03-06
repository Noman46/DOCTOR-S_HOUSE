/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.service;

import com.noman.doctorshouse.dao.BaseDao;
import com.noman.doctorshouse.domain.Doctor;
import com.noman.doctorshouse.rm.DoctorRowMapper;
import java.util.HashMap;

import java.util.Map;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noman Ibrahim
 */
@Service
public class DoctorServiceImpl extends BaseDao implements DoctorService {

    @Override
    public void save(Doctor d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Doctor d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String doctorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor findById(String doctorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor docLogin(String doctorId, String password) {
        String sql = "SELECT doctorId, name, phone, email, address FROM doctor WHERE doctorId=:docI AND password=:pw";
        Map m = new HashMap();
        m.put("docI", doctorId);
        m.put("pw", password);
        try {
            Doctor d = getNamedParameterJdbcTemplate().queryForObject(sql, m, new DoctorRowMapper());
            return d;
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }

}
