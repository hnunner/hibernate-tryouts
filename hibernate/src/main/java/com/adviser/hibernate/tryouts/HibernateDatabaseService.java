package com.adviser.hibernate.tryouts;

import java.util.logging.Logger;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Provides;
import org.apache.felix.ipojo.annotations.Requires;
import org.apache.felix.ipojo.annotations.Validate;

import com.adviser.hibernate.tryouts.helpers.daos.BarDao;
import com.adviser.hibernate.tryouts.helpers.services.DatabaseService;

/**
 * @author Hendrik Nunner
 */
@Component
@Instantiate
@Provides
public class HibernateDatabaseService implements DatabaseService {

    private static final Logger LOG = Logger.getLogger(HibernateDatabaseService.class.getName());

    @Requires
    private BarDao fooBarDao;

    @Validate
    private void start() {
        LOG.info(getClass().getName() + " :: Start");
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public BarDao getBarDao() {
        return fooBarDao;
    }

}
