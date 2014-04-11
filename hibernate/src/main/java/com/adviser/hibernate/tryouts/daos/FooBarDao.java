package com.adviser.hibernate.tryouts.daos;

import java.util.List;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Provides;
import org.apache.felix.ipojo.annotations.Requires;
import org.hibernate.Session;

import com.adviser.hibernate.tryouts.helpers.daos.BarDao;
import com.adviser.hibernate.tryouts.helpers.models.Bar;
import com.adviser.hibernate.tryouts.utils.HibernateUtil;

@Component(immediate=true)
@Instantiate
@Provides
public class FooBarDao implements BarDao {

    @Requires
    private HibernateUtil hibernateUtil;

    @Override
    public void add(Bar fooBar) {
        Session s = hibernateUtil.getSession();
        s.getTransaction().begin();
        s.persist(fooBar);
        s.getTransaction().commit();
        s.close();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Bar> getAll() {
        Session s = hibernateUtil.getSession();
        s.getTransaction().begin();
        List<Bar> list = s.createQuery("from FooBar").list();
        s.getTransaction().commit();
        s.close();
        return list;
    }

}
