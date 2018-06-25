package com.example.admin.repository;

import com.example.admin.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person,Long> {

    Person findOneByEmail(String email);

    Person findByEmail(String email);
}
