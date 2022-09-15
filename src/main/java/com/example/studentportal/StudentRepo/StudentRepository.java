package com.example.studentportal.StudentRepo;

import com.example.studentportal.StudentModel.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {



}
