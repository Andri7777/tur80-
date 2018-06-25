package com.example.admin.service.serviceImpl;

import com.example.admin.dto.RecreationRequest;
import com.example.admin.dto.RecreationResponce;
import com.example.admin.entity.Recreation;
import com.example.admin.repository.RecreationRepository;
import com.example.admin.service.RecreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecreationServiceImpl implements RecreationService {

    @Autowired
    private RecreationRepository recreationRepository;

    @Override
    public List<Recreation> findAll() {
        return recreationRepository.findAll();
    }

    @Override
    public Recreation findOne(Long id) {
        return recreationRepository.findOne(id);
    }

    @Override
    public RecreationResponce save(RecreationRequest recreationRequest) {
        Recreation recreation = new Recreation();
        recreation.setFirstName(recreationRequest.getFirstName());
        recreation.setLastName(recreationRequest.getLastName());
        recreation.setSurname(recreationRequest.getSurname());
        recreation.setUsed(recreationRequest.isUsed());
        recreation = recreationRepository.save(recreation);
        return new RecreationResponce(recreation);
    }
}
