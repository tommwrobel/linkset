package com.linkset.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Linkset {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Linkset() {
    }

    public Linkset(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
