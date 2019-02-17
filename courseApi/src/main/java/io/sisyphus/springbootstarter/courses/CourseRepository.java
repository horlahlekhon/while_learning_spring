package io.sisyphus.springbootstarter.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

// apring JPA makes sure to provide an interface that is implemented by a repository class which 
//define a set of default actions that is usually done on an entity like getItem, update, all major
//crud acions....so by extending the CrudRepository<EntityClass, EntityID> we will inherit all those methods
//and if we have any additional ops that isnt defined ion the CRUD we can define them in our own interface that
//extends the CRUD thus making it very cool.
public interface CourseRepository extends CrudRepository<Course, String>{

    //we can declare more method for our JPA in this interface and the JPA can figure our what we need
    // in a special way of defining the method. make sure it start by the word 'findBy' then followed by
    // the property you wish to filter tha data by. so we want to find all courses by name we make a method
    //that returns a List<Class> this tells the JPA that our implementation will return a list and not a si gle object
    //then we make the method takes the property we want to filter by as parametre . here the JPA can infer that we wanta  list
    //of the List<Class> filtered by the param we passed into the method. its kinda complicated , but it is not bad.

    //so lets we want to find all courses that have the same topic now. the relationship is deep; but the JPA syntax of defining 
    // the methods can handle it we just have to define the name as the depth increases.. i.e
    //we want to findByTopic this would make the JPA known that we want to search by a field ion the Course named 
    //Topic, but if the field is a class or user defined object like foreing key that has a table of its own onthe databse, 
    //we willhave to define the field of that table that we want to filter by too.. so our name will go like
    // findbyTopicId(String id)

    public List<Course> findByTopicId(String name) ;
    
}