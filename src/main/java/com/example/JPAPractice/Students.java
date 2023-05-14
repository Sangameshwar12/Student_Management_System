package com.example.JPAPractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
    private int StudentId;

    private String name;

    private int age;

    private int marks;
    @OneToOne(mappedBy = "students")
    LibraryCard libraryCard;

}
