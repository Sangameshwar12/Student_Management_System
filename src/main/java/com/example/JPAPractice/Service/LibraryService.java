package com.example.JPAPractice.Service;

import com.example.JPAPractice.LibraryCard;
import com.example.JPAPractice.Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    @Autowired
    LibraryRepository libraryRepository;
    public void addCard(LibraryCard card) {

        libraryRepository.save(card);
    }
}
