package com.example.admin.service.serviceImpl;

import com.example.admin.dto.TrolleyCrossingRequest;
import com.example.admin.dto.TrolleyCrossingResponce;
import com.example.admin.entity.TrolleyCrossing;
import com.example.admin.repository.TrolleyCrossingRepository;
import com.example.admin.service.TrolleyCrossingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrolleyCrossingServiceImpl implements TrolleyCrossingService {

    @Autowired
    private TrolleyCrossingRepository trolleyCrossingRepository;
    @Override
    public List<TrolleyCrossing> findAll() {
        return trolleyCrossingRepository.findAll();
    }

    @Override
    public TrolleyCrossing findOne(Long id) {
        return trolleyCrossingRepository.findOne(id);
    }

    @Override
    public TrolleyCrossingResponce save(TrolleyCrossingRequest trolleyCrossingRequest) {
        TrolleyCrossing trolleyCrossing = new TrolleyCrossing();
        trolleyCrossing.setFirstName(trolleyCrossingRequest.getFirstName());
        trolleyCrossing.setLastName(trolleyCrossingRequest.getLastName());
        trolleyCrossing.setSurname(trolleyCrossingRequest.getSurname());
        trolleyCrossing.setUsed(trolleyCrossingRequest.isUsed());
        trolleyCrossing = trolleyCrossingRepository.save(trolleyCrossing);
        return new TrolleyCrossingResponce(trolleyCrossing);
    }
}
