package com.example.admin.controller;

import com.example.admin.dto.RecreationRequest;
import com.example.admin.dto.RecreationResponce;
import com.example.admin.entity.Recreation;
import com.example.admin.service.RecreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Recreation")
public class RecreationController {
    
    @Autowired
    private RecreationService recreationService;
    
    @PostMapping
    public RecreationResponce save(@RequestBody RecreationRequest recreationRequest){
        return recreationService.save(recreationRequest);
    }
    
    @GetMapping("/get")
    public List<Recreation> GetdAll(){
        return recreationService.findAll();
    }
    
    @GetMapping("/")
    public Recreation findOne(Long id){
        return recreationService.findOne(id);
    }
    
}
