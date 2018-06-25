package com.example.admin.repository;

import com.example.admin.entity.TrolleyCrossing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrolleyCrossingRepository extends JpaRepository<TrolleyCrossing,Long> {
}
