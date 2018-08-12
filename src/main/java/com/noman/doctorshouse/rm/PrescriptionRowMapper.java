/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.rm;

import com.noman.doctorshouse.domain.Prescription;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Noman Ibrahim
 */
public class PrescriptionRowMapper implements RowMapper<Prescription>{

    @Override
    public Prescription mapRow(ResultSet rs, int i) throws SQLException {
        
        Prescription p = new Prescription();
        
        p.setStudentId(rs.getString("studentId"));
        p.setStudentName(rs.getString("studentName"));
        p.setAge(rs.getInt("age"));
        p.setDisease(rs.getString("disease"));
        p.setMedicine(rs.getString("medicine"));
        p.setStrength(rs.getString("strength"));
        p.setRoute(rs.getString("route"));
        p.setFrequency(rs.getString("frequency"));
        p.setStartDate(rs.getString("startDate"));
        p.setEndDate(rs.getString("endDate"));
        p.setRemarks(rs.getString("remarks"));
        
        return p;
             
    }
    
}
