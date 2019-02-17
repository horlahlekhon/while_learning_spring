// package com.sisphus.springframeworktutorials;

// import com.sisphus.springframeworktutorials.mockitodemo.DataService;
// import com.sisphus.springframeworktutorials.mockitodemo.SomeBusinessImpl;

// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.junit.MockitoJUnitRunner;

// import static org.junit.Assert.*;
// import static org.mockito.Mockito.mock;
// import static org.mockito.Mockito.when;

// //mockito has annotations that can be used to decorate test methiods to make test mocking more easier

// @RunWith(MockitoJUnitRunner.class)
// public class SomeBusinessMockAnnotationsTest {

//     @Mock //this annot. will create te mock directly
//     DataService dataService;

//     @InjectMocks //this will make sure all the dependecies are injected 
//     SomeBusinessImpl someBiz;

//     @Test
//     public void testFindTheGreatestDataFromAll() {
//         DataService dataServiceMock = mock(DataService.class);  //create a mock of the class

//         //here we tell the method we want to use te data it wuill return
//         when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,2,3});

//         //pass the mocked data as a dependency to the requiring class
//         int result = someBiz.findGreatestFromAllData();

//         assertEquals(3, result);

//     }


// }
