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


    /**
     * Constructor.
     *
     * @param name
     *          FooBar's name
     */
    protected FooBar(String name) {
        super();
        this.name = name;
    }


    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
