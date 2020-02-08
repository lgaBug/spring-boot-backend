package com.example.sb01.service;

import com.example.sb01.dao.PersonMapper;
import com.example.sb01.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper mapper;

    @Override
    public List<Person> findAll() {
        return mapper.findAll();
    }

    @Override
    public List<Person> findByName(String name) {
        return mapper.findByName(name);
    }
}