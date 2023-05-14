package com.example.JPAPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired StudentRepository studentRepository;

    public String addStudent(Students students){

        studentRepository.save(students);

        return "Student added Successfully";
    }

    public Students findStudentById(int id) {

        return studentRepository.findById(id).get();
    }


    public List<Students> getAllStudents() {

        List<Students> students = studentRepository.findAll();
        return students;
    }

    public String deleteById(int id) {
        
        studentRepository.deleteById(id);
        return "Student deleted Successfully";
    }

    public Students updateNameById(int id, String name) {

        Students students = studentRepository.findById(id).get();
        studentRepository.deleteById(id);

        students.setName(name);

        studentRepository.save(students);

        return students;



    }

    public String deleteAllStudents() {

        studentRepository.deleteAll();
        return "Students deleted from database";
    }

    public List<Students> findAllStudents(int age) {

        List<Students> students = findAllStudents(age);
        return students;
    }
}
