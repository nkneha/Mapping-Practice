package com.example.Mapping_practice.controller;

import com.example.Mapping_practice.model.Course;
import com.example.Mapping_practice.model.Laptop;
import com.example.Mapping_practice.service.CourseService;
import com.example.Mapping_practice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
    @PostMapping("courses")
    public void addAllCourses(@RequestBody List<Course> courses){
        courseService.createAllCourses(courses);
    }
    @PostMapping("course")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }
    @PutMapping("course/id/{id}")
    public String updateCourseDuration(@PathVariable Long id, @RequestParam Integer duration){
        return courseService.updateCourseDuration(id,duration);

    }
    @DeleteMapping("course/id/{id}")
    public String deleteCourseById(@PathVariable Long id){
        return courseService.deleteCourseDetail(id);

    }
}
