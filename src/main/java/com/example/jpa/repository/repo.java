package com.example.jpa.repository;

import com.example.jpa.entity.students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<students, Integer> {

}
