package com.liveperson.jaxbtest.jaxb.tests;

import com.liveperson.jaxbtest.jaxb.TestBase;
import com.liveperson.jaxbtest.model.Message;
import com.liveperson.jaxbtest.model.Segment;
import com.liveperson.jaxbtest.xml.IXmlHelper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.bind.JAXBException;

import static org.junit.Assert.assertNotNull;

/**
 *
 * User: Lee
 * Date: 05/02/13
 * Time: 13:28
 */
public class MarshallingTest extends TestBase
{
    @Autowired
    IXmlHelper xmlhelper;

    public MarshallingTest()
    {
        super(MarshallingTest.class);
    }

    /**
    * A Test to validate that a Message class object can be marshalled into a String.
    */
    @Test
    public void simpleMarshallingTest() throws JAXBException
    {
        String messagexml = xmlhelper.marshal(createTestMessage());

        assertNotNull(messagexml);
    }

    /**
     * Returns a dummy Message class
     *
     * @return  Message
     */
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
