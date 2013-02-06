package com.liveperson.jaxbtest.jaxb;

import com.liveperson.jaxbtest.model.Message;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * User: Lee
 * Date: 05/02/13
 * Time: 14:09
 */
public class UnMarshallingTest
{
    public UnMarshallingTest()
    {

    }

    @Test
    public void simpleUnMarshallingTest()
    {

        String segmentName = "Test Segment";
        String testXml =    "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                            "<message xmlns=\"http://liveperson.com/v1.0\" xmlns:ns2=\"http://www.w3.org/1999/xlink\">\n" +
                            "    <Segment>\n" +
                            "        <name>" + segmentName + "</name>\n" +
                            "        <description>This is a test segment</description>\n" +
                            "    </Segment>\n" +
                            "</message>";

        try {
            JAXBContext context = JAXBContext.newInstance(Message.class);

            Unmarshaller unmarshaller = context.createUnmarshaller();

            Message message = (Message)unmarshaller.unmarshal(new StringReader(testXml));

            assertNotNull(message);
            assertTrue(message.getSegment() != null);
            assertTrue(message.getSegment().getName().equals(segmentName));

        } catch (JAXBException e) {
//            logger.debug("An exception occured unmarshaling the data");
        }
    }
}
