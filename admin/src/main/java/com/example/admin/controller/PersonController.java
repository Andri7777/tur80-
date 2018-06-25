package com.example.admin.controller;


import com.example.admin.dto.PersonRequest;
import com.example.admin.dto.PersonResponce;
import com.example.admin.entity.Person;
import com.example.admin.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public PersonResponce save(@RequestBody PersonRequest personRequest){
        return personService.save(personRequest);
    }

    @GetMapping
    public List<Person> getAll(){
        return personService.findAll();
    }

    @GetMapping("/")
    public Person findOne(Long id){
        return personService.findOne(id);

    }

    @DeleteMapping
    public void delete(Long id){
        personService.delete(id);
    }

}
