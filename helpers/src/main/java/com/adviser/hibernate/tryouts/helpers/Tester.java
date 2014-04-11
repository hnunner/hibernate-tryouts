package com.adviser.hibernate.tryouts.helpers;

import java.util.List;
import java.util.logging.Logger;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Requires;
import org.apache.felix.ipojo.annotations.Validate;

import com.adviser.hibernate.tryouts.helpers.models.Bar;
import com.adviser.hibernate.tryouts.helpers.models.BarFactory;
import com.adviser.hibernate.tryouts.helpers.services.DatabaseService;

@Component(immediate=true)
@Instantiate
public class Tester {

    private static final Logger LOG = Logger.getLogger(Tester.class.getName());

    @Requires
    private BarFactory barFactory;
    @Requires
    private DatabaseService databaseService;

    @Validate
    private void start() throws Exception {
        LOG.info(getClass().getName() + ":: Starting in 3..");
        Thread.sleep(1000);
        LOG.info(getClass().getName() + ":: Starting in 2..");
        Thread.sleep(1000);
        LOG.info(getClass().getName() + ":: Starting in 1..");
        Thread.sleep(1000);

        // new data point
        Bar bar1 = barFactory.createBar("foo");
        databaseService.getBarDao().add(bar1);
        LOG.info("Successfully added first foo bar");

        Bar bar2 = barFactory.createBar("bar");
        databaseService.getBarDao().add(bar2);
        LOG.info("Successfully added second foo bar");

        List<Bar> allBars = databaseService.getBarDao().getAll();
        for (Bar bar : allBars) {
            LOG.info("Found bar: " + bar.getId() + ", " + bar.getName());
        }
    }

}
