package com.liveperson.jaxbtest.jaxb;

import com.liveperson.jaxbtest.model.Message;
import com.liveperson.jaxbtest.model.Segment;
import com.liveperson.jaxbtest.xml.IXmlHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.bind.JAXBException;

/**
 * User: Lee
 * Date: 05/02/13
 * Time: 13:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/helpers.xml"})
public class MarshallingTest
{
    @Autowired
    IXmlHelper xmlhelper;

    @Test
    public void simpleMarshallingTest()
    {
        try
        {
            System.out.println(xmlhelper.marshal(createTestMessage()));

        }catch (JAXBException e)
        {
//            logger.debug("An exception occured marshaling the data");
        }
    }

    private Message createTestMessage()
    {
        Message message = new Message();

        // Add a Segment to the Message
        Segment segment = new Segment();
        segment.setName("Test Segment");
        segment.setDescription("This is a test segment");

        message.setSegment(segment);

        return message;
    }
}
