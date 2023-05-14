package com.example.JPAPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    @Autowired LibraryRepository libraryRepository;
    public void addCard(LibraryCard card) {

        libraryRepository.save(card);
    }
}
