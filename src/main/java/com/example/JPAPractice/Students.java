package com.example.JPAPractice;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // this tells us this is a class which is have to reate table in database
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Students{


    //@Id => to declare primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int StudentId;

    private String name;

    private int age;

    private int marks;

    @OneToOne(mappedBy = "students", cascade = CascadeType.ALL)
    LibraryCard libraryCard;

}
