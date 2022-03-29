package com.example.consumingrest.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)

@Entity
@Table(name = "quote_table")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String type;
    //private Value value;

    public Quote() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public Value getValue() {
//        return value;
//    }
//
//    public void setValue(Value value) {
//        this.value = value;
//    }

}