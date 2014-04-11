package com.adviser.hibernate.tryouts.helpers.daos;

import java.util.List;

import com.adviser.hibernate.tryouts.helpers.models.Bar;

/**
 * @author Hendrik Nunner
 *
 * @param <B>
 *          the type of Bar
 */
public interface BarDao<B extends Bar> {

    public void add(B bar);

    public List<B> getAll();

}
