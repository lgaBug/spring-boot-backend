package com.example.sb01.controller;

import com.example.sb01.domain.Person;
import com.example.sb01.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping(value = "findAll")
    public List<Person> findAll() {
        List<Person> list = service.findAll();

        return list;
    }

    @GetMapping(value = "person")
    public List<Person> findByName(@RequestParam("name") String name) {

        System.out.println("进来了！！！！");
        List<Person> result = null;
        result = service.findByName(name);
        return result;
    }
}
