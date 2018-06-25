package com.example.admin.repository;

import com.example.admin.entity.JumpFromTheBridge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JumpFromTheBridgeRepository extends JpaRepository<JumpFromTheBridge,Long> {
}
