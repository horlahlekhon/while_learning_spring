package com.sisphus.springframeworktutorials.cdi;

import javax.inject.Inject;
import javax.inject.Named;
@Named
public class SomeCDIBusiness{

    @Inject
    SomeCDIDAO someCdiDao;

    /**
     * @return the someCdiDao
     */
    public SomeCDIDAO getSomeCdiDao() {
        return someCdiDao;
    }

    /**
     * @param someCdiDao the someCdiDao to set
     */
    public void setSomeCdiDao(SomeCDIDAO someCdiDao) {
        this.someCdiDao = someCdiDao;
    }

    public int findGreated() {
        int[] data = someCdiDao.getData();

        int greatest = Integer.MIN_VALUE;

        for (int var : data) {
            if (var > greatest) {
                greatest = var;
                               
            }
        }
        return greatest;
        
    }



}