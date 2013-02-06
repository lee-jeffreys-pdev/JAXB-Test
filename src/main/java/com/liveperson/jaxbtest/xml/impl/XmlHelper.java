package com.liveperson.jaxbtest.xml.impl;

import com.liveperson.jaxbtest.model.Message;
import com.liveperson.jaxbtest.xml.IXmlHelper;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * User: Lee
 * Date: 05/02/13
 * Time: 20:23
 */
@Component("xmlhelper")
public class XmlHelper implements IXmlHelper
{
    private JAXBContext context;
    private Marshaller marshaller;
    private Unmarshaller unmarshaller;
    private Logger logger = Logger.getLogger(XmlHelper.class);

    public XmlHelper()
    {
        try {
            context = JAXBContext.newInstance(Message.class);
            marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            unmarshaller = context.createUnmarshaller();
        } catch (JAXBException e) {
            logger.debug("Unable to initialize the Marshaller");
        }
    }

    public String marshal(Message message) throws JAXBException
    {
        try {
            StringWriter writer = new StringWriter();
            marshaller.marshal(message, writer);
            return writer.toString();
        } catch (JAXBException e) {
            logger.debug("Failed to marshal Message");
            throw e;
        }
    }

    public Message unmarshal(String xml) throws JAXBException
    {
        try {
            StringReader reader = new StringReader(xml);
            Message message = (Message)unmarshaller.unmarshal(reader);
            return message;
        } catch (JAXBException e) {
            logger.debug("Failed to unmarshal xml");
            throw e;
        }
    }
}
