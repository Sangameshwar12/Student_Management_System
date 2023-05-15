package com.example.JPAPractice.Service;

import com.example.JPAPractice.EnumPackege.Department;
import com.example.JPAPractice.LibraryCard;
import com.example.JPAPractice.Repository.StudentRepository;
import com.example.JPAPractice.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(Students students, Department department){

        LibraryCard card = new LibraryCard();
        card.setDepartment(department);
        card.setStudents(students);
        students.setLibraryCard(card);

        studentRepository.save(students);

        return "Student added Successfully";
    }

    public void deleteById(Integer id) {

        studentRepository.deleteById(id);
    }

    public List<String> findByAge(int age) {

        List<Students> students = studentRepository.findByAge(age);
        List<String> names = new ArrayList<>();
        for(Students students1 : students){
            names.add(students1.getName());
        }
        return names;
    }

    public List<String> findByAgeMarks(int age, int marks) {

        List<Students> students = studentRepository.findByAgeAndMarks(age, marks);
        List<String> names = new ArrayList<>();

        for(Students students1 : students){
           names.add(students1.getName());
        }
        return names;
    }

    public List<String> getAllAgeGreaterThan(int age) {
        List<Students> students = studentRepository.getByAgeGreaterThan(age);
        List<String> names = new ArrayList<>();

        for(Students students1:students){
            names.add(students1.getName());
        }
        return names;

    }

    public Students getStudentByid(int id) {

        Optional<Students> student = studentRepository.findById(id);
        return student.get();
    }

/*    public Students findStudentById(int id) {

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

        List<Student> students = studentRepository.findAll();
   }*/

}
