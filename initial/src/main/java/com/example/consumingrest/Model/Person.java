package com.example.consumingrest.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)

@Entity
@Table(name = "person_table")
public class Person {
    @Id
    //identity does not work?
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;


    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}