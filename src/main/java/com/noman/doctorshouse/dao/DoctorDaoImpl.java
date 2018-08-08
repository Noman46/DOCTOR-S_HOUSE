/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.dao;

import com.noman.doctorshouse.domain.Doctor;
import com.noman.doctorshouse.rm.DoctorRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Noman Ibrahim
 */
@Repository
public class DoctorDaoImpl extends BaseDao implements DoctorDao {

    @Override
    public void save(Doctor doc) {
        String sql = "INSERT INTO doctor (doctorId, name, phone, email, address, password)"
                + "VALUES (:doctorId, :name, :phone, :email, :address, :password)";

        Map m = new HashMap();
        m.put("doctorId", doc.getDoctorId());
        m.put("name", doc.getName());
        m.put("phone", doc.getPhone());
        m.put("email", doc.getEmail());
        m.put("address", doc.getAddress());
        m.put("password", doc.getPassword());

        SqlParameterSource ps = new MapSqlParameterSource(m);
        getNamedParameterJdbcTemplate().update(sql, ps);
    }

    @Override
    public void update(Doctor doc) {
        String sql = "UPDATE doctor SET doctorId=:doctorId, name=:name, phone=:phone, email=:email, address=:address, password=:password WHERE doctorId=:doctorId";

        Map m = new HashMap();
        m.put("doctorId", doc.getDoctorId());
        m.put("name", doc.getName());
        m.put("phone", doc.getPhone());
        m.put("email", doc.getEmail());
        m.put("address", doc.getAddress());
        m.put("password", doc.getPassword());

        getNamedParameterJdbcTemplate().update(sql, m);
    }

    @Override
    public void delete(Doctor doc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String doctorId) {
        String sql = "DELETE FROM doctor WHERE doctorId=?";
        getJdbcTemplate().update(sql, doctorId);

    }

    @Override
    public Doctor findById(String doctorId) {
        String sql = "SELECT doctorId, name, phone, email, address FROM doctor WHERE doctorId=?";
        Doctor d = getJdbcTemplate().queryForObject(sql, new DoctorRowMapper(), doctorId);
        return d;
    }

    @Override
    public List<Doctor> findAll() {
        String sql = "SELECT doctorId, name, phone, email, address FROM doctor";
        List<Doctor> d = getJdbcTemplate().query(sql, new DoctorRowMapper());
        return d;
    }

    @Override
    public List<Doctor> findByProperty(String propName, Object propValue) {
        String sql = "SELECT doctorId, name, phone, email, address FROM doctor WHERE " + propName + "=?";
        return getJdbcTemplate().query(sql, new DoctorRowMapper(), propValue);
    }

    @Override
    public List<Doctor> orderByPriority(String propName, Object propValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
