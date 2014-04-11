package com.adviser.hibernate.tryouts.helpers.daos;

import java.util.List;

import com.adviser.hibernate.tryouts.helpers.models.Bar;

/**
 * @author Hendrik Nunner
 */
public interface BarDao {

    public void add(Bar bar);

    public List<Bar> getAll();

}
