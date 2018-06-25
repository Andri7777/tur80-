package com.example.admin.service.serviceImpl;

import com.example.admin.dto.JumpFromTheBridgeRequest;
import com.example.admin.dto.JumpFromTheBridgeResponce;
import com.example.admin.entity.JumpFromTheBridge;
import com.example.admin.repository.JumpFromTheBridgeRepository;
import com.example.admin.service.JumpFromTheBridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JumpFromTheBridgeServiceImpl implements JumpFromTheBridgeService {

    @Autowired
    private JumpFromTheBridgeRepository jumpFromTheBridgeRepository;

    @Override
    public List<JumpFromTheBridge> findAll() {
        return jumpFromTheBridgeRepository.findAll();
    }

    @Override
    public JumpFromTheBridge findOne(Long id) {
        return jumpFromTheBridgeRepository.findOne(id);
    }

    @Override
    public JumpFromTheBridgeResponce save(JumpFromTheBridgeRequest jumpFromTheBridgeRequest) {
        JumpFromTheBridge jumpFromTheBridge = new JumpFromTheBridge();
        jumpFromTheBridge.setFirstName(jumpFromTheBridgeRequest.getFirstName());
        jumpFromTheBridge.setLastName(jumpFromTheBridgeRequest.getLastName());
        jumpFromTheBridge.setSurname(jumpFromTheBridgeRequest.getSurname());
        jumpFromTheBridge.setUsed(jumpFromTheBridgeRequest.isUsed());
        jumpFromTheBridge = jumpFromTheBridgeRepository.save(jumpFromTheBridge);
        return new JumpFromTheBridgeResponce(jumpFromTheBridge);
    }

    @Override
    public void update(JumpFromTheBridge jumpFromTheBridge) {
        jumpFromTheBridgeRepository.save(jumpFromTheBridge);

    }
}
