package com.liveperson.jaxbtest;

import org.apache.log4j.Logger;

/**
 * User: Lee
 * Date: 05/02/13
 * Time: 13:44
 */
public class TestBase <T extends TestItem>
{
    protected Logger logger;

    protected TestBase(Class<T> clazz)
    {
        logger = Logger.getLogger(clazz);
    }
}
