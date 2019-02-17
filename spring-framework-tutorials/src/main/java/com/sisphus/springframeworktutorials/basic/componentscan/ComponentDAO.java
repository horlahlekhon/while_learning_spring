package com.sisphus.springframeworktutorials.basic.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
public class ComponentDAO {

    @Autowired
    ComponentJdbcConnection jdbcConnection;

    /**
     * @return the jdbcConnection
     */
    public ComponentJdbcConnection getComponentJdbcConnection() {
        return jdbcConnection;
    }

    /**
     * @param jdbcConnection the jdbcConnection to set
     */
    public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    
}

