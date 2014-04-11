package com.adviser.hibernate.tryouts.utils;

import java.util.logging.Logger;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Provides;
import org.apache.felix.ipojo.annotations.Requires;
import org.apache.felix.ipojo.annotations.Validate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Component
@Instantiate
@Provides
public class HibernateUtilImpl implements HibernateUtil {

    private static final Logger LOG = Logger.getLogger(HibernateUtilImpl.class.getName());

    @Requires
    private SessionFactory sessionFactory;

    @Validate
    private void start() {
        LOG.info(getClass().getName() + " :: Start");
    }

    @Override
    public Session getSession() {
        return sessionFactory.openSession();
    }

}
