package com.liveperson.jaxbtest.jaxb.tests;

import com.liveperson.jaxbtest.jaxb.TestBase;
import com.liveperson.jaxbtest.model.Message;
import com.liveperson.jaxbtest.xml.IXmlHelper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.bind.JAXBException;
import java.io.StringReader;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * User: Lee
 * Date: 05/02/13
 * Time: 14:09
 */
public class UnMarshallingTest extends TestBase
{
    @Autowired
    IXmlHelper xmlhelper;

    public UnMarshallingTest()
    {
        super(UnMarshallingTest.class);
    }

    @Test
    public void simpleUnMarshallingTest() throws JAXBException
    {
        String segmentName = "Test Segment";
        String testXml =    "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                            "<message xmlns=\"http://liveperson.com/v1.0\" xmlns:ns2=\"http://www.w3.org/1999/xlink\">\n" +
                            "    <Segment>\n" +
                            "        <name>" + segmentName + "</name>\n" +
                            "        <description>This is a test segment</description>\n" +
                            "    </Segment>\n" +
                            "</message>";

            Message message = xmlhelper.unmarshal(new StringReader(testXml));

            assertNotNull(message);
            assertTrue(message.getSegment() != null);
            assertTrue(message.getSegment().getName().equals(segmentName));
    }
}
