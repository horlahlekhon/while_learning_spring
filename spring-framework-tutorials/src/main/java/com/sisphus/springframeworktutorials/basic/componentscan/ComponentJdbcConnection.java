package com.sisphus.springframeworktutorials.basic.componentscan;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
class ComponentJdbcConnection {


    public ComponentJdbcConnection(){
        System.out.println("Jdbc connection");
    }
}