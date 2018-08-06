/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.dao;

import com.noman.doctorshouse.domain.Student;
import com.noman.doctorshouse.rm.StudentRowMapper;
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
public class StudentDaoImpl extends BaseDao implements StudentDao {

    @Override
    public void save(Student stu) {
        String sql = "INSERT INTO student (studentId, name, phone, email, address, dept, session, password)"
                + "VALUES (:studentId, :name, :phone, :email, :address, :dept, :session, :password)";

        Map m = new HashMap();
        m.put("studentId", stu.getStudentId());
        m.put("name", stu.getName());
        m.put("phone", stu.getPhone());
        m.put("email", stu.getEmail());
        m.put("address", stu.getAddress());
        m.put("dept", stu.getDept());
        m.put("session", stu.getSession());
        m.put("password", stu.getPassword());

        SqlParameterSource ps = new MapSqlParameterSource(m);
        getNamedParameterJdbcTemplate().update(sql, ps);
    }

    @Override
    public void update(Student stu) {
        String sql = "UPDATE student SET name=:name, phone=:phone, email=:email, address=:address, dept=:dept, session=:session, password=:password WHERE studentId=:studentId";

        Map m = new HashMap();
        m.put("studentId", stu.getStudentId());
        m.put("name", stu.getName());
        m.put("phone", stu.getPhone());
        m.put("email", stu.getEmail());
        m.put("address", stu.getAddress());
        m.put("dept", stu.getDept());
        m.put("session", stu.getSession());
        m.put("password", stu.getPassword());

        getNamedParameterJdbcTemplate().update(sql, m);
    }

    @Override
    public void delete(Student stu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String studentId) {
        String sql = "DELETE FROM student WHERE studentId=?";
        getJdbcTemplate().update(sql, studentId);
    }

    @Override
    public Student findById(String studentId) {
        String sql = "SELECT studentId, name, phone, email, address, dept, session FROM student WHERE studentId=?";
        Student s = getJdbcTemplate().queryForObject(sql, new StudentRowMapper(), studentId);
        return s;
    }

    @Override
    public List<Student> findAll() {
        String sql = "SELECT studentId, name, phone, email, address, dept, session FROM student";
        List<Student> s = getJdbcTemplate().query(sql, new StudentRowMapper());
        return s;

    }

    @Override
    public List<Student> findByProperty(String propName, Object propValue) {
         String sql = "SELECT studentId, name, phone, email, address, dept, session FROM student WHERE "+propName+"=?";
          return getJdbcTemplate().query(sql, new StudentRowMapper(), propValue);
    }

    @Override
    public List<Student> orderByPriority(String propName, Object propValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
