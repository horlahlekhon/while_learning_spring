package io.sisyphus.springbootstarter.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.sisyphus.springbootstarter.topic.Topic;

/**
 * Topic
 */
// @Entity is used to mark a class as an entity class so that the JPA can
// identify it as a database table
@Entity
public class Course {

    @Id // mark as primary key
    private String id;
    private String name;
    private String description;

    //this typically makes the JPA knows that the Topic field of the Course classs is a foreing key of the primary key topicId
    //in class and table topic.
    @ManyToOne
    private Topic topic;

    public Course() {

    }

    public Course(String id, String name, String description, String topicId) {

        super();
        this.id = id;
        this.name = name;
        this.description = description;
        // the way we set the id here is rather strange, but spring will get set the id
        // as the ide passed in, and the empty strings means
        // we wont change the data that afre already stored in the place. they just
        // serve as comp;leting the list of args for the constructor
        this.topic = new Topic(topicId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getDescription() {
        return description;
    }

    public void SetDescription(String description) {
        this.description = description;
    }

    /**
     * @return the topic
     */
    public Topic getTopic() {
        return topic;
    }

    /**
     * @param topic the topic to set
     */
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}