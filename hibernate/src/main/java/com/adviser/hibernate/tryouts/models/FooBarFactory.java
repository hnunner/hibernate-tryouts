package com.adviser.hibernate.tryouts.models;

import com.adviser.hibernate.tryouts.helpers.models.Bar;
import com.adviser.hibernate.tryouts.helpers.models.BarFactory;

/**
 * @author Hendrik Nunner
 */
public class FooBarFactory implements BarFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public Bar createBar(String name) {
        return new FooBar(name);
    }

}
