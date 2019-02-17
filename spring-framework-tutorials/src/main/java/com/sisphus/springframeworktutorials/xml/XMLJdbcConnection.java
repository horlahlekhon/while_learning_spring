package com.sisphus.springframeworktutorials.xml;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
class XMLJdbcConnection {


    public XMLJdbcConnection(){
        System.out.println("Jdbc connection");
    }
}