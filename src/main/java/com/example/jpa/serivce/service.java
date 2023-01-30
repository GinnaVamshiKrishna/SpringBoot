package com.example.jpa.serivce;

import com.example.jpa.entity.students;
import com.example.jpa.repository.repo;
import jakarta.persistence.EntityNotFoundException;
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

    public void store(students stud) {
        rep.save(stud);
    }
    public void find(students stu) {
        students s = rep.findById(stu.getStudentid()).orElseThrow(EntityNotFoundException::new);
        s.setFirstname(stu.getFirstname());
        s.setLastname(stu.getLastname());
        rep.save(s);
    }

    public void del(students stud) {
        rep.deleteById(stud.getStudentid());

    }
}
