package com.example.demo.dao;

import com.example.demo.beans.Person;
import com.example.demo.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDAO {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll() {return personRepository.findAll();}
}
