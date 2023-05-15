package com.example.JPAPractice.Controller;

import com.example.JPAPractice.EnumPackege.Department;
import com.example.JPAPractice.Service.StudentService;
import com.example.JPAPractice.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody Students students, @RequestParam("department") Department department){
        studentService.addStudent(students, department);

        return "Student added Succefully";
    }

//    @GetMapping("/find/{id}")
//    public Students findStudentById(@PathVariable int id){
//
//        return studentService.findStudentById(id);
//    }

    // get all the students from database?

//    @GetMapping("/get-all-students")
//    public List<Students> getAllStudents(){
//
//        return studentService.getAllStudents();
//    }
//
//
//    // delete a student by studentId?
//
//    @DeleteMapping("/delete-student-by-id")
//    public String deleteStudentById(@RequestParam int id){
//
//        return studentService.deleteById(id);
//    }
//
//    //update a student's name by taking student id?
//
//    @PutMapping("/update-name-by-id")
//    public Students updateNameById(@RequestParam int id, @RequestParam String name){
//        return studentService.updateNameById(id, name);
//    }
//
//
//    //find all the students of age 20
//
//    @GetMapping("/find-all-students")
//    public List<Students> findAllStudents(@RequestParam int age){
//
//        return studentService.findAllStudents(age);
//    }
//    // delete all the students
//
//    @DeleteMapping("/delete-all-students")
//    public String deleteAllStudents(){
//        return studentService.deleteAllStudents();
//    }
//

    @DeleteMapping("/delete")
    public String deleteById(@RequestParam("Id")Integer id){
        studentService.deleteById(id);

        return "student deleted Successfully";
    }

    @GetMapping("/get-by-age")
    public List<String> getByAge(@RequestParam("age")int age){

        return studentService.findByAge(age);


    }

    @GetMapping("/get-by-age-and-marks")
    public List<String> getByAgeMarks(@RequestParam("age")int age, @RequestParam("marks")int marks){

        return studentService.findByAgeMarks(age, marks);
    }

    @GetMapping("/get-all-age-greter-than")
    public List<String> getByAgeGreterThan(@RequestParam("age")int age){

        return studentService.getAllAgeGreaterThan(age);
    }

//    @GetMapping("find-by-id")
//    public Students findById(@RequestParam("id")int id){
//
//        return studentService.getStudentByid(id);
//    }

}
