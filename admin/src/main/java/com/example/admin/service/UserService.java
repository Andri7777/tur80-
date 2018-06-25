package com.example.admin.service;

import com.example.admin.dto.LoginRequest;
import com.example.admin.dto.UserRequest;
import com.example.admin.entity.Person;

import java.util.List;

public interface UserService {


    String login(LoginRequest loginRequest);

    public Person findUserByEmail(String email);


    List<Person> findAll();

    void create(UserRequest userRequest);
}
