package com.example.sb01.service;

import com.example.sb01.domain.Person;

import java.util.Date;
import java.util.List;

public interface PersonService {

    List<Person> findAll();

    List<Person> findByName(String name);
}
