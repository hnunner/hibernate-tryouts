package com.adviser.hibernate.tryouts;

import java.util.List;
import java.util.logging.Logger;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Requires;
import org.apache.felix.ipojo.annotations.Validate;

import com.adviser.hibernate.tryouts.daos.FooBarService;
import com.adviser.hibernate.tryouts.models.FooBar;

@Component(immediate=true)
@Instantiate
public class Tester {

    private static final Logger LOG = Logger.getLogger(Tester.class.getName());

    @Requires
    private FooBarService fooBarService;

    @Validate
    private void start() throws Exception {
        LOG.info(getClass().getName() + ":: Starting in 3..");
        Thread.sleep(1000);
        LOG.info(getClass().getName() + ":: Starting in 2..");
        Thread.sleep(1000);
        LOG.info(getClass().getName() + ":: Starting in 1..");
        Thread.sleep(1000);

        // new data point
        FooBar fooBar1 = new FooBar();
        fooBar1.setName("foo");
        fooBarService.add(fooBar1);
        LOG.info("Successfully added first foo bar");

        FooBar fooBar2 = new FooBar();
        fooBar2.setName("bar");
        fooBarService.add(fooBar2);
        LOG.info("Successfully added second foo bar");

        List<FooBar> allFooBars = fooBarService.getAll();
        for (FooBar fooBar : allFooBars) {
            LOG.info("Found foo bar: " + fooBar.getId() + ", " + fooBar.getName());
        }

    }

}
