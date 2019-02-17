package com.sisphus.springframeworktutorials.cdi;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import com.sisphus.springframeworktutorials.SpringFrameworkTutorialsCdiApplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnit44Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(MockitoJUnit44Runner.class)
public class SomeCDIBusinessTest{


    @InjectMocks
    SomeCDIBusiness someCdiBiz ;

    @Mock
    SomeCDIDAO cdiDaoMock;

    @Test
    public void testFindGreates() {
        when(cdiDaoMock.getData()).thenReturn(new int[] {2,3,4});
        assertEquals(4, someCdiBiz.findGreated());
    }
    
    @Test
    public void testFindGreates2() {
        when(cdiDaoMock.getData()).thenReturn(new int[] { });
        assertEquals(Integer.MIN_VALUE, someCdiBiz.findGreated());
    }

    @Test
    public void testFindGreates3() {
        when(cdiDaoMock.getData()).thenReturn(new int[] {2,2,2});
        assertEquals(2, someCdiBiz.findGreated());
    }

}