package com.liveperson.jaxbtest.jaxb;

import com.liveperson.jaxbtest.TestBase;
import com.liveperson.jaxbtest.TestItem;
import com.liveperson.jaxbtest.model.Message;
import com.liveperson.jaxbtest.model.Segment;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * User: Lee
 * Date: 05/02/13
 * Time: 13:28
 */
public class MarshallingTest extends TestBase implements TestItem
{
    public MarshallingTest()
    {
        super(MarshallingTest.class);
    }

    @Test
    public void simpleMarshallingTest()
    {
        try
        {
            JAXBContext context = JAXBContext.newInstance(Message.class);

            Marshaller marshaller = context.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(createTestMessage(), System.out);
        }catch (JAXBException e)
        {
            logger.debug("An exception occured marshaling the data");
        }
    }

    private Message createTestMessage()
    {
        Message message = new Message();

        Segment segment = new Segment();
        segment.setName("Test Segment");
        segment.setDescription("This is a test segment");

        message.setSegment(segment);

        return message;
    }
}
