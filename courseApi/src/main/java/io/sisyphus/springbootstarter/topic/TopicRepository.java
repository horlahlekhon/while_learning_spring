package io.sisyphus.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

// apring JPA makes sure to provide an interface that is implemented by a repository class which 
//define a set of default actions that is usually done on an entity like getItem, update, all major
//crud acions....so by extending the CrudRepository<EntityClass, EntityID> we will inherit all those methods
//and if we have any additional ops that isnt defined ion the CRUD we can define them in our own interface that
//extends the CRUD thus making it very cool.
public interface TopicRepository extends CrudRepository<Topic, String>{

    
}