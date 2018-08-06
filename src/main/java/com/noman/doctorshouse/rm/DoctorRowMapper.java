/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.rm;

import com.noman.doctorshouse.domain.Doctor;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Noman Ibrahim
 */
public class DoctorRowMapper implements RowMapper<Doctor> {

    @Override
    public Doctor mapRow(ResultSet rs, int i) throws SQLException {
        Doctor d = new Doctor();
        d.setDoctorId(rs.getString("doctorId"));
        d.setName(rs.getString("name"));
        d.setPhone(rs.getString("phone"));
        d.setEmail(rs.getString("email"));
        d.setAddress(rs.getString("address"));

        return d;
    }

}
