package com.sisphus.springframeworktutorials;

import com.sisphus.springframeworktutorials.mockitodemo.DataService;
import com.sisphus.springframeworktutorials.mockitodemo.SomeBusinessImpl;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class SomeBusinessStubTest {

    @Test
   public void testFindTheGreatestDataFromAll(){
       SomeBusinessImpl someBiz = new SomeBusinessImpl(new DataServiceStub());
       int result = someBiz.findGreatestFromAllData();

       assertEquals(4, result);

   }

   class DataServiceStub implements DataService{

        @Override
        public int[] retrieveAllData() {
            return new int[]{1,2,3,4};
        }

   }

}
