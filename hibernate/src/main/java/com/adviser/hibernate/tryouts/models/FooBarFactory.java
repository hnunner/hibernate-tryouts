package com.adviser.hibernate.tryouts.models;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Provides;

import com.adviser.hibernate.tryouts.helpers.models.Bar;
import com.adviser.hibernate.tryouts.helpers.models.BarFactory;

/**
 * @author Hendrik Nunner
 */
@Component
@Instantiate
@Provides
public class FooBarFactory implements BarFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public Bar createBar(String name) {
        return new FooBar(name);
    }

}
