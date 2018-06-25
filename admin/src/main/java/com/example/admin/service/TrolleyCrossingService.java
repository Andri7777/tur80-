package com.example.admin.service;

import com.example.admin.dto.TrolleyCrossingRequest;
import com.example.admin.dto.TrolleyCrossingResponce;
import com.example.admin.entity.TrolleyCrossing;

import java.util.List;

public interface TrolleyCrossingService {

    List<TrolleyCrossing> findAll();
    TrolleyCrossing findOne(Long id);
    TrolleyCrossingResponce save(TrolleyCrossingRequest trolleyCrossingRequest);
}
