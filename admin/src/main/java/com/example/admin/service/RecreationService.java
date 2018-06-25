package com.example.admin.service;

import com.example.admin.dto.RecreationRequest;
import com.example.admin.dto.RecreationResponce;
import com.example.admin.entity.Recreation;

import java.util.List;

public interface RecreationService {

    List<Recreation> findAll();
    Recreation findOne(Long id);
    RecreationResponce save(RecreationRequest recreationRequest);

}
