package com.example.admin.controller;

import com.example.admin.dto.TrolleyCrossingRequest;
import com.example.admin.dto.TrolleyCrossingResponce;
import com.example.admin.entity.TrolleyCrossing;
import com.example.admin.service.TrolleyCrossingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/TrolleyCrossing")
public class TrolleyCrossingController {
    
    @Autowired
    private TrolleyCrossingService trolleyCrossingService;
    
    @PostMapping
    public TrolleyCrossingResponce save(@RequestBody TrolleyCrossingRequest trolleyCrossingRequest){
        return trolleyCrossingService.save(trolleyCrossingRequest);
    }
    
    @GetMapping("/get")
    public List<TrolleyCrossing> getAll(){
        return trolleyCrossingService.findAll();
    }
    
    @GetMapping("/")
    public TrolleyCrossing findOne(Long id){
        return trolleyCrossingService.findOne(id);
    }
}
