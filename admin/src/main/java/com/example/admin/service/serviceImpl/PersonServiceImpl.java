package com.example.admin.service.serviceImpl;

import com.example.admin.dto.PersonRequest;
import com.example.admin.dto.PersonResponce;
import com.example.admin.entity.Person;
import com.example.admin.repository.PersonRepository;
import com.example.admin.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findOne(Long id) {
        return personRepository.findOne(id);
    }

    @Override
    public PersonResponce save(PersonRequest personRequest) {
        Person person = new Person();
        person.setFirstName(personRequest.getFirstName());
        person.setLastName(personRequest.getLastName());
        person.setSurname(personRequest.getSurname());
        person.setEmail(personRequest.getEmail());
        person.setPassword(personRequest.getPassword());
        person = personRepository.save(person);
        return new PersonResponce(person);
    }

    @Override
    public void delete(Long id) {
        personRepository.delete(id);
    }
}
