package com.liveperson.jaxbtest.transformers;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * User: Lee
 * Date: 08/02/13
 * Time: 16:41
 */
public class XMLTransformer
{
    private Transformer transformer;

    public XMLTransformer(String stylesheet)
    {
        try
        {
            TransformerFactory factory = TransformerFactory.newInstance();

            StringReader reader = new StringReader(stylesheet);

            Source source = new StreamSource(reader);

            transformer = factory.newTransformer(source);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
    }

    public String transform(String sourceString)
    {
        StringReader reader = new StringReader(sourceString);

        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);

        try
        {
            Source source = new StreamSource(reader);

            transformer.transform(source, result);

        } catch (TransformerException e) {
            e.printStackTrace();
        }

        return result.getWriter().toString();
    }
}
