package com.sisyphus.springaop.springaop.business;

import com.sisyphus.springaop.springaop.data.Dao1;
import com.sisyphus.springaop.springaop.data.Dao2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    public String calculateSomething() {
        return dao1.retrieveSomething();
    }

    public void callThrowException() throws Exception {
        dao1.throwException();
    }

    
}