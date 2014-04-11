package com.adviser.hibernate.tryouts.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

public class HibernateUtil {

    private static SessionFactory sf;

    public static Session getSession() {
        return getSessionFactory().openSession();
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static SessionFactory getSessionFactory() {
        if ( sf == null ) {
            Bundle thisBundle = FrameworkUtil.getBundle( HibernateUtil.class );
            // Could get this by wiring up OsgiTestBundleActivator as well.
            BundleContext context = thisBundle.getBundleContext();

            ServiceReference sr = context.getServiceReference( SessionFactory.class.getName() );
            sf = (SessionFactory) context.getService( sr );
        }
        return sf;
    }

}
