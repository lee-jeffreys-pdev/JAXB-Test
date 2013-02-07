package com.liveperson.jaxbtest.jaxb;

import org.apache.log4j.Logger;

/**
 * User: Lee
 * Date: 07/02/13
 * Time: 16:09
 */
public abstract class TestBase
{
    protected Logger logger;

    public TestBase(Class clazz)
    {
        logger = Logger.getLogger(clazz);
    }
}
