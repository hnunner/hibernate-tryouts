package com.adviser.hibernate.tryouts.daos;

import java.util.List;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Provides;
import org.hibernate.Session;

import com.adviser.hibernate.tryouts.models.FooBar;
import com.adviser.hibernate.tryouts.utils.HibernateUtil;

@Component(immediate=true)
@Instantiate
@Provides
public class FooBarServiceImpl implements FooBarService {

    @Override
    public void add(FooBar dp) {
        Session s = HibernateUtil.getSession();
        s.getTransaction().begin();
        s.persist( dp );
        s.getTransaction().commit();
        s.close();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<FooBar> getAll() {
        Session s = HibernateUtil.getSession();
        s.getTransaction().begin();
        List<FooBar> list = s.createQuery( "from FooBar" ).list();
        s.getTransaction().commit();
        s.close();
        return list;
    }

}
