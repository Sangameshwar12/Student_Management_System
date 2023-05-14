package com.example.JPAPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody Students students){
        studentService.addStudent(students);

        return "Student added Succefully";
    }

    @GetMapping("/find/{id}")
    public Students findStudentById(@PathVariable int id){

        return studentService.findStudentById(id);
    }

    // get all the students from database?

    @GetMapping("/get-all-students")
    public List<Students> getAllStudents(){

        return studentService.getAllStudents();
    }


    // delete a student by studentId?

    @DeleteMapping("/delete-student-by-id")
    public String deleteStudentById(@RequestParam int id){

        return studentService.deleteById(id);
    }

    //update a student's name by taking student id?

    @PutMapping("/update-name-by-id")
    public Students updateNameById(@RequestParam int id, @RequestParam String name){
        return studentService.updateNameById(id, name);
    }


    //find all the students of age 20

    @GetMapping("/find-all-students")
    public List<Students> findAllStudents(@RequestParam int age){

        return studentService.findAllStudents(age);
    }
    // delete all the students

    @DeleteMapping("/delete-all-students")
    public String deleteAllStudents(){
        return studentService.deleteAllStudents();
    }

}
