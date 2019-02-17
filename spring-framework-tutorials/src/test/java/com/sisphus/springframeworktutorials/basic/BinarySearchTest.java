// package com.sisphus.springframeworktutorials.basic;

// import static org.junit.Assert.*;

// import com.sisphus.springframeworktutorials.SpringFrameworkTutorialsBasicApplication;

// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.test.context.ContextConfiguration;
// import org.springframework.test.context.junit4.SpringRunner;

// // testing springapps we would need to get the Spring context, and retrieve any bean we want
// //to test on from it. defining spring vontext here , we would use the @ContextConfiguration annota.
// //and pass in the spring app's config class to it, the config class is the class that houses the main method
// @RunWith(SpringRunner.class)
// @ContextConfiguration(classes=SpringFrameworkTutorialsBasicApplication.class)
// public class BinarySearchTest{

//     //get this bean from the context, by using @Autowired to inject the bean
//     @Autowired
//     BinarySearchImpl binarySearch;

//     @Test
//     public void testBasicScenario() {
//         //we should be able to call this method and test their results
//         int result = binarySearch.binarySearch(new int[]{1,2,3}, 3);

//         assertEquals(3,result);
        
//     }

// }