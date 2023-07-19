package com.example.Mapping_practice.repository;

import com.example.Mapping_practice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course,Long> {
}
