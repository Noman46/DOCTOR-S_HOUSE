
package com.noman.doctorshouse.service;

import com.noman.doctorshouse.domain.Student;
import java.util.List;

/**
 *
 * @author Noman Ibrahim
 */
public interface StudentService {

    public void register(Student s);

    public Student login(String studentId, String password);

    public List<Student> getStudentsList();

}
