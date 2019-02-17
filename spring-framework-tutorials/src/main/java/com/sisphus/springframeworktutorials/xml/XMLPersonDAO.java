package com.sisphus.springframeworktutorials.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
public class XMLPersonDAO {

    @Autowired
    XMLJdbcConnection xmlJdbcConnection;

    /**
     * @return the jdbcConnection
     */
    public XMLJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }

    /**
     * @param xmlJdbcConnection the jdbcConnection to set
     */
    public void setXmlJdbcConnection(XMLJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

    
}

