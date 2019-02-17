// package com.sisphus.springframeworktutorials;

// import static org.junit.Assert.assertEquals;
// import static org.mockito.Mockito.*;
// import static org.mockito.Mockito.when;

// import java.util.List;

// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.mockito.junit.MockitoJUnitRunner;

// @RunWith(MockitoJUnitRunner.class)
// public class ListTest {

//     @Test
//     public void testList_single_return() {
//        List listMock =  mock(List.class);
//        //we can mock the java list interface, and make any of its method to return what we want 
//        //here we do that to List.size() which returns the size of the list
//         when(listMock.size()).thenReturn(10);
//         assertEquals(10, listMock.size());
//     }
//     @Test
//     public void testList_multiple_return() {
//         List listMock = mock(List.class);
//         // we can also do multiple return, where we can specify what the method will
//         // return whn=en called
//         // the first time, second and subsequent times.
//         when(listMock.size()).thenReturn(10).thenReturn(20);
//         assertEquals(10, listMock.size());
//         assertEquals(20, listMock.size());
//     }

//     @Test
//     public void testGet() {
//         // we can mock methods that have parametres too
//         List listMock = mock(List.class);
//         //we are basically saying if the method is called with param 0, it shold returns the specified
//         //if other param is passed to it , it will return something null
//         when(listMock.get(0)).thenReturn("some String");
//         assertEquals("some String", listMock.get(0));
//     }

//     @Test
//     public void testGet_generic_param() {
//         List listMock = mock(List.class);
//         //we can test the get method to always returns a specific return value whenever it is called, with
//         //either an int.
//         when(listMock.get(anyInt())).thenReturn("some String");
//         //we can do this to  a vast array of params , as mockito provides a shitload of any<datattype>
//         //methods used for this purpose
//         assertEquals("some String", listMock.get(0));
//     }

// }