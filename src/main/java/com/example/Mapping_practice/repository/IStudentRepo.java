package com.example.Mapping_practice.repository;

import com.example.Mapping_practice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student,Long> {
}
