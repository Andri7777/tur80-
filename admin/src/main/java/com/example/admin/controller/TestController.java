package com.example.admin.controller;


import com.example.admin.sequrity.tokenUtils.TokenTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class TestController {

    @Autowired
    private TokenTool tokenTool;

//    @PostMapping
//    public String getToken(@RequestParam String email,String role){
//        return tokenTool.createToken(email,role);
//    }

    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public String getToken(){
        return "SUCCESS";
    }
}
