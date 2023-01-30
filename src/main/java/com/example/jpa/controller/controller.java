package com.example.jpa.controller;

import com.example.jpa.entity.students;
import com.example.jpa.entity.studentsupdate;
import com.example.jpa.serivce.service;
import org.hibernate.annotations.SQLUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class controller {
    @Autowired
    service serv;


    @GetMapping("/")
    public List<students> totaldetails(){
        return serv.gettotaldetails();
    }

    @PostMapping("/1")
    public void newrow(@RequestBody students stud){
        serv.store(stud);
    }

    @PutMapping("/2")
    public void update(@RequestBody students stud){
        serv.find(stud);
    }

    @DeleteMapping("/3")
    public void delete(@RequestBody students stud){
        serv.del(stud);
    }





}
