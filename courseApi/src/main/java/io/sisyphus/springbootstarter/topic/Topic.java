package io.sisyphus.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Topic
 */
//@Entity is used to mark a class as an entity class so that the JPA can identify it as a database table
@Entity
public class Topic {

    @Id //mark as primary key
    private String id;
    private String name;
    private String description;

    public Topic() {
        
    }

    public Topic(String id, String name, String description){

        super();
        this.id = id;
        this.name = name ;
        this.description = description;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;

    }
    public String getDescription(){
        return description; 
    }
    public void SetDescription(String description) {
        this.description = description;
    }

    
}