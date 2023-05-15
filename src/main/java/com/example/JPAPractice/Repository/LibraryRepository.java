package com.example.JPAPractice.Repository;

import com.example.JPAPractice.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryCard, Integer> {


}
