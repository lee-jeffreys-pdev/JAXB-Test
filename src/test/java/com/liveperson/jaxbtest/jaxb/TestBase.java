package com.liveperson.jaxbtest.jaxb;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * An abstract base class for all JUnit Test classes.  All Test classes should extend this
 * class in order to get access to common resources.
 *
 * User: Lee
 * Date: 07/02/13
 * Time: 16:09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/testhelpers.xml"})
public abstract class TestBase
{
    protected Logger logger;

    /**
     * This constructor passes a class which is used to retrieve the appropriate Logger for the
     * superclass.
     *
     * @param clazz     A Class object, used to retrieve the correct Logger
     */
    protected TestBase(Class clazz)
    {
        logger = Logger.getLogger(clazz);
    }
}
