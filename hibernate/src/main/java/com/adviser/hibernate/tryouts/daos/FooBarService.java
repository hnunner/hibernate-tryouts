package com.adviser.hibernate.tryouts.daos;

import java.util.List;

import com.adviser.hibernate.tryouts.models.FooBar;

public interface FooBarService {

    public void add(FooBar dp);

    public List<FooBar> getAll();

}
