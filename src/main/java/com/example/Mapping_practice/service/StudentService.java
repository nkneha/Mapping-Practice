package com.example.Mapping_practice.service;

import com.example.Mapping_practice.model.Student;
import com.example.Mapping_practice.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public void createAllStudent(List<Student>students) {
        studentRepo.saveAll(students);
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public String updateStudentPhoneNumber(Long id, String mobNumber) {
        Optional<Student> studentDetails=studentRepo.findById(id);
        Student myStudent = null;
        if(studentDetails.isPresent())
        {
            myStudent = studentDetails.get();
        }
        else {
            return "Id not Found!!!";
        }
        myStudent.setPhoneNumber(mobNumber);
        studentRepo.save(myStudent);
        return "room type updated";
    }

    public String deleteStudentDetail(Long id) {
        studentRepo.deleteById(id);
        return "student deleted successfully";
    }
}
