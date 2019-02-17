package com.sisphus.springframeworktutorials;

import com.sisphus.springframeworktutorials.mockitodemo.DataService;
import com.sisphus.springframeworktutorials.mockitodemo.SomeBusinessImpl;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

    @Test
    public void testFindTheGreatestDataFromAll() {
        DataService dataServiceMock = mock(DataService.class);  //create a mock of the class

        //here we tell the method we want to use te data it wuill return
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3});

        //pass the mocked data as a dependency to the requiring class
        SomeBusinessImpl someBiz = new SomeBusinessImpl(dataServiceMock);
        int result = someBiz.findGreatestFromAllData();

        assertEquals(3, result);

    }


}
