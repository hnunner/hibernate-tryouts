//
//  DatabaseService.java
//  hibernate-tryouts-helpers
//
//  Created by Hendrik Nunner on 11.04.2014.
//  Copyright (c) 2014 securizon. All rights reserved.
//
package com.adviser.hibernate.tryouts.helpers.services;

import com.adviser.hibernate.tryouts.helpers.daos.BarDao;
import com.adviser.hibernate.tryouts.helpers.models.Bar;

/**
 * @author Hendrik Nunner
 *
 * @param <B>
 *          the type of Bar
 */
public interface DatabaseService<B extends Bar> {

    BarDao<B> getBarDao();

}
