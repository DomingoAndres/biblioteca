package com.example.biblioteca.repository;

import com.example.biblioteca.model.LibroModel;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    private List<LibroModel> listalibros = new ArrayList<>();

    @PostConstruct
    public void init(){
        listalibros.add(new LibroModel(2,"978-1654565","Spring in action", "Addison-Wesley", 2018, "Joshua Bosch"));

        listalibros.add(new LibroModel(2, "978-1617294945", "Spring in Action", "Manning", 2020, "Craig Walls"));

        listalibros.add(new LibroModel(3, "978-1491950357", "Designing Data-Intensive Applications", "O'Reilly Media", 2017, "Martin Kleppmann"));

        listalibros.add(new LibroModel(4, "978-0132350884", "Clean Code", "Prentice Hall", 2008, "Robert C. Martin"));
    }

}
