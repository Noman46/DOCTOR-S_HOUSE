/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.service;

import com.noman.doctorshouse.dao.BaseDao;
import com.noman.doctorshouse.dao.StudentDao;
import com.noman.doctorshouse.domain.Student;
import com.noman.doctorshouse.rm.StudentRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noman Ibrahim
 */
@Service
public class StudentServiceImpl extends BaseDao implements StudentService {

    @Autowired
    private StudentDao dao;

    @Override
    public void register(Student s) {
        dao.save(s);
    }

    @Override
    public Student login(String studentId, String password) {
        String sql = "SELECT studentId, name, phone, email, address, dept, session FROM student WHERE studentId=:stI AND password=:pw";
        Map m = new HashMap();
        m.put("stI", studentId);
        m.put("pw", password);
        try {
            Student s = getNamedParameterJdbcTemplate().queryForObject(sql, m, new StudentRowMapper());
            return s;
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }

    }

    @Override
    public List<Student> getStudentsList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
