package com.example.jpa.serivce;

import com.example.jpa.entity.students;
import com.example.jpa.repository.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {
    @Autowired
    repo rep;
    public List<students> gettotaldetails() {
        return rep.findAll();
    }
}
