package com.example.admin.repository;

import com.example.admin.entity.Recreation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecreationRepository extends JpaRepository<Recreation,Long> {
}
