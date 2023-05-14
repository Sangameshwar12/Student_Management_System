package com.example.JPAPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class LibraryController {

    @Autowired LibraryService libraryService;

    @PostMapping("/add-card")
    public String addCard(@RequestBody LibraryCard card){

        libraryService.addCard(card);

        return "Card Added";
    }
}
