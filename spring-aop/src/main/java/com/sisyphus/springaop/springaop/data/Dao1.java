package com.sisyphus.springaop.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    public String retrieveSomething() {
        return "dAO 1";
        
    }
    
    public void throwException() throws Exception {
        String f = "r";

            Integer.parseInt(f);

    }

    
}