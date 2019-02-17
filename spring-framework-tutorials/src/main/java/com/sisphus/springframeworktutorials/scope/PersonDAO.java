package com.sisphus.springframeworktutorials.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
public class PersonDAO {

    @Autowired
    JdbcConnection jdbcConnection;

    /**
     * @return the jdbcConnection
     */
    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    /**
     * @param jdbcConnection the jdbcConnection to set
     */
    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    
}

