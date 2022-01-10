package com.demo.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        System.out.println(student);
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        boolean isPresent=studentRepository.existsById(id);
        System.out.println(isPresent);
        if (isPresent) {
            studentRepository.deleteById(id);
        }
    }
}
