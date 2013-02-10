package com.liveperson.jaxbtest.xml;

import com.liveperson.jaxbtest.model.Message;

import javax.xml.bind.JAXBException;
import java.io.Reader;

/**
 * User: Lee
 * Date: 05/02/13
 * Time: 21:45
 */
public interface IXmlHelper
{
    public String marshal(Message message) throws JAXBException;
    public Message unmarshal(String xml) throws JAXBException;
    public Message unmarshal(Reader reader) throws JAXBException;
}
