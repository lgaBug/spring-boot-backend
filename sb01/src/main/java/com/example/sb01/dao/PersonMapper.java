package com.example.sb01.dao;

import com.example.sb01.domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface PersonMapper {

     List<Person> findAll();

     List<Person> findByName(@Param("name") String name);
}
