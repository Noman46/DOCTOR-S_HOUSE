/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.dao;

import com.noman.doctorshouse.domain.Student;
import java.util.List;

/**
 *
 * @author Noman Ibrahim
 */
public interface StudentDao {
   
    
    
    public void save(Student stu);

    public void update(Student stu);

    public void delete(Student stu);

    public void delete(String studentId);

    public Student findById(String studentId);

    public List<Student> findAll();

    public List<Student> findByProperty(String propName, Object propValue);

    public List<Student> orderByPriority(String propName, Object propValue);
}
