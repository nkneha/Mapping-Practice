package com.example.Mapping_practice.service;

import com.example.Mapping_practice.model.Course;
import com.example.Mapping_practice.model.Laptop;
import com.example.Mapping_practice.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public void createAllCourses(List<Course> courses) {
        courseRepo.saveAll(courses);
    }

    public void addCourse(Course course) {
        courseRepo.save(course);
    }

    public String updateCourseDuration(Long id, Integer duration) {
        Optional<Course> courseDetails=courseRepo.findById(id);
        Course myCourse = null;
        if(courseDetails.isPresent())
        {
            myCourse = courseDetails.get();
        }
        else {
            return "Id not Found!!!";
        }
        myCourse.setDuration(duration);
        courseRepo.save(myCourse);
        return "Course Duration updated";
    }

    public String deleteCourseDetail(Long id) {
        courseRepo.deleteById(id);
        return "Course deleted successfully";
    }
}
