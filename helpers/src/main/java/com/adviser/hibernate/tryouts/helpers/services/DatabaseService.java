package com.adviser.hibernate.tryouts.helpers.services;

import com.adviser.hibernate.tryouts.helpers.daos.BarDao;

/**
 * @author Hendrik Nunner
 */
public interface DatabaseService {

    BarDao getBarDao();

}
