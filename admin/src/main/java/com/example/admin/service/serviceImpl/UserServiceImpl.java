package com.example.admin.service.serviceImpl;

import com.example.admin.dto.LoginRequest;
import com.example.admin.dto.UserRequest;
import com.example.admin.entity.Person;
import com.example.admin.repository.UserRepository;
import com.example.admin.sequrity.tokenUtils.TokenTool;
import com.example.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    private final TokenTool tokenTool;


    @Autowired
    public UserServiceImpl(TokenTool tokenTool, UserRepository userRepository) {
        this.tokenTool = tokenTool;
        this.userRepository = userRepository;

    }


    public String login(LoginRequest loginRequest) {
        Person user = userRepository.findOneByEmail(loginRequest.getLogin());
        if (user != null) {
            if (user.getPassword().equals(loginRequest.getPassword())) {
                return tokenTool.createToken(user.getEmail(), user.getRole().name());
            } else {
                throw new IllegalArgumentException("Wrong input data");
            }
        } else {
            throw new IllegalArgumentException("Wrong input data");
        }
    }

    @Override
    public Person findUserByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }

    @Override
    public List<Person> findAll() {
        return userRepository.findAll();
    }


    public void create(UserRequest userRequest) {
        Person user = new Person();
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setRole(userRequest.getRole());
        userRepository.save(user);
    }
}
