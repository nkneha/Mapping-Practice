package com.example.Mapping_practice.controller;

import com.example.Mapping_practice.model.Student;
import com.example.Mapping_practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @PostMapping("students")
    public void addAllStudent(@RequestBody List<Student> students){
        studentService.createAllStudent(students);
    }
    @PostMapping("student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @PutMapping("student/id/{id}")
    public String updateStudentPhoneNumber(@PathVariable Long id,@RequestParam String mobNumber){
        return studentService.updateStudentPhoneNumber(id,mobNumber);

    }
    @DeleteMapping("student/id/{id}")
    public String deleteStudentById(@PathVariable Long id){
        return studentService.deleteStudentDetail(id);

    }

}
