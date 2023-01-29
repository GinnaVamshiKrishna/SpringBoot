package com.example.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "studentdetails")
public class students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentid ;

    @Column(name= "firstname")
    private String firstname;

    @Column(name ="lastname")
    private String lastname;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
