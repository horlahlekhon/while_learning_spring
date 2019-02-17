package com.sisphus.springframeworktutorials.cdi;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named
class SomeCDIDAO {

    public int[] getData() {
        return new int[]{1,3,5};
    }
}