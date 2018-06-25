package com.example.admin.controller;

import com.example.admin.dto.JumpFromTheBridgeRequest;
import com.example.admin.dto.JumpFromTheBridgeResponce;
import com.example.admin.entity.JumpFromTheBridge;
import com.example.admin.service.JumpFromTheBridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import javax.ws.rs.*;
import java.util.List;

//@Path("/api/users.json?page=1&count=5")

@RestController
@CrossOrigin
@RequestMapping("/JumpFromTheBridge")
public class JumpFromTheBridgeController {

    @Autowired
    private JumpFromTheBridgeService jumpFromTheBridgeService;

    @PostMapping
    public JumpFromTheBridgeResponce save(@RequestBody JumpFromTheBridgeRequest jumpFromTheBridgeRequest){
        return jumpFromTheBridgeService.save(jumpFromTheBridgeRequest);
    }

    @GetMapping("/get")
    public List<JumpFromTheBridge> getAll(){
        return jumpFromTheBridgeService.findAll();
    }
    
    @GetMapping("/")
    public JumpFromTheBridge findOne(Long id){
        return jumpFromTheBridgeService.findOne(id);
    }

//    @PUT(value = "{id")
//    public JumpFromTheBridge putOne(@PathParam("id")int jumpFromTheBridgeId,@RequestBody JumpFromTheBridge jumpFromTheBridge){
//        jumpFromTheBridge.setId(jumpFromTheBridgeId);
//        return jumpFromTheBridgeService.save(jumpFromTheBridge);
//    }
//
//    @POST
//    public JumpFromTheBridgeResponce findOne(@RequestBody JumpFromTheBridgeRequest jumpFromTheBridgeRequest) {
//        return jumpFromTheBridgeService.save(jumpFromTheBridgeRequest);
//    }
//
//    @PostMapping("/updateUser")
//    public String updateUser(@PathParam("id")){
//        return null;
//    }
}
