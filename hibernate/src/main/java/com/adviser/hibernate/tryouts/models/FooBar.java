package com.adviser.hibernate.tryouts.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.adviser.hibernate.tryouts.helpers.models.Bar;

@Entity
public class FooBar implements Bar {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
