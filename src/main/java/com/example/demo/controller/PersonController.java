package com.example.demo.controller;

import com.example.demo.beans.Person;
import com.example.demo.dao.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonDAO personDAO;

    @GetMapping("/person")
    public List<Person> findAllPersons(){return personDAO.findAll();}
}
