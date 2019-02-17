package com.sisphus.springframeworktutorials.mockitodemo;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeBusinessImpl {

    @Autowired
    DataService dataService;

    public SomeBusinessImpl(DataService dataService){
        this.dataService = dataService;
    }

    public int findGreatestFromAllData(){
        int[] data = dataService.retrieveAllData();

        int greatest = Integer.MIN_VALUE;

        for (int var : data) {
            if (var > greatest) {
                greatest = var;
            }
        }
        return greatest;
    }
}