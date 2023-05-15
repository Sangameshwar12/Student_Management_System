package com.example.JPAPractice.Repository;


import com.example.JPAPractice.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer> {


    List<Students> findByAge(int age);

    List<Students> findByAgeAndMarks(int age, int marks);

    @Query(value = "selcet * from Students s where s.age > :age", nativeQuery = true)
    List<Students> getByAgeGreaterThan(int age);
}
