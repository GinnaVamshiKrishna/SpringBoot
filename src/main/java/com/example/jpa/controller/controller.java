package com.example.jpa.controller;

import com.example.jpa.entity.students;
import com.example.jpa.serivce.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class controller {
    @Autowired
    service serv;
    @GetMapping("/")
    public students totaldetails(){
        return serv.gettotaldetails().get(0);

    }


}
