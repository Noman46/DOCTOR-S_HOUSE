/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.dao;

import com.noman.doctorshouse.domain.Prescription;
import com.noman.doctorshouse.rm.PrescriptionRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Noman Ibrahim
 */
@Repository
public class PrescriptionDaoImpl extends BaseDao implements PrescriptionDao{

    @Override
    public void save(Prescription pre) {
        String sql = "INSERT INTO prescription(doctorId, studentId, studentName, age, disease, medicine, strength, route, frequency, startDate, endDate, remarks)"
                + " VALUES(:doctorId, :studentId, :studentName, :age, :disease, :medicine, :strength, :route, :frequency, :startDate, :endDate, :remarks)";
        Map m = new HashMap();
        m.put("doctorId", pre.getDoctorId());
        m.put("studentId", pre.getStudentId());
        m.put("studentName", pre.getStudentName());
        m.put("age", pre.getAge());
        m.put("disease", pre.getDisease());
        m.put("medicine", pre.getMedicine());
        m.put("strength", pre.getStrength());
        m.put("route", pre.getRoute());
        m.put("frequency", pre.getFrequency());
        m.put("startDate", pre.getStartDate());
        m.put("endDate", pre.getEndDate());
        m.put("remarks", pre.getRemarks());
       

        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        super.getNamedParameterJdbcTemplate().update(sql, ps, kh);
        Integer preId = kh.getKey().intValue();
        pre.setPreId(preId);
    }

    @Override
    public Prescription findById(String studentId) {
         String sql = "SELECT studentId, studentName, age, disease, medicine, strength, route, frequency, startDate, endDate, remarks"
                + " FROM prescription WHERE studentId=?";
        Prescription pre = getJdbcTemplate().queryForObject(sql, new PrescriptionRowMapper(), studentId);
        return pre;
    }
    
    @Override
    public List<Prescription> findAll(String studentId) {
        String sql = "SELECT  studentId, studentName, age, disease, medicine, strength, route, frequency, startDate, endDate, remarks"
                + " FROM prescription WHERE studentId=?";
        List<Prescription> p = getJdbcTemplate().query(sql, new PrescriptionRowMapper(),studentId);
        return p;

    }

   
    
}
