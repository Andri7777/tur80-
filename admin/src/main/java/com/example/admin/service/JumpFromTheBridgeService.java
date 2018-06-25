package com.example.admin.service;

import com.example.admin.dto.JumpFromTheBridgeRequest;
import com.example.admin.dto.JumpFromTheBridgeResponce;
import com.example.admin.entity.JumpFromTheBridge;

import java.util.List;

public interface JumpFromTheBridgeService {

    List<JumpFromTheBridge> findAll();
    JumpFromTheBridge findOne(Long id);
    JumpFromTheBridgeResponce save(JumpFromTheBridgeRequest jumpFromTheBridgeRequest);
    void update(JumpFromTheBridge jumpFromTheBridge);
}
