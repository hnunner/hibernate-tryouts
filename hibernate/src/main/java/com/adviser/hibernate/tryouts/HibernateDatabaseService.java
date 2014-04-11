//
//  DatabaseService.java
//  hibernate-tryouts-hibernate
//
//  Created by Hendrik Nunner on 11.04.2014.
//  Copyright (c) 2014 securizon. All rights reserved.
//
package com.adviser.hibernate.tryouts;

import java.util.logging.Logger;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Provides;
import org.apache.felix.ipojo.annotations.Requires;
import org.apache.felix.ipojo.annotations.Validate;

import com.adviser.hibernate.tryouts.helpers.daos.BarDao;
import com.adviser.hibernate.tryouts.helpers.services.DatabaseService;
import com.adviser.hibernate.tryouts.models.FooBar;

/**
 * @author Hendrik Nunner
 */
@Component
@Instantiate
@Provides
public class HibernateDatabaseService implements DatabaseService<FooBar> {

    private static final Logger LOG = Logger.getLogger(HibernateDatabaseService.class.getName());

    @Requires
    private BarDao<FooBar> fooBarDao;

    @Validate
    private void start() {
        LOG.info(getClass().getName() + " :: Start");
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public BarDao<FooBar> getBarDao() {
        return fooBarDao;
    }

}
