package com.example.admin.service;

import com.example.admin.dto.PersonRequest;
import com.example.admin.dto.PersonResponce;
import com.example.admin.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> findAll();
    Person findOne(Long id);
    PersonResponce save(PersonRequest personRequest);
    void delete(Long id);
}
