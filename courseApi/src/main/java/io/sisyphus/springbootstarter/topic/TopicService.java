package io.sisyphus.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// a business service.....when spring startsup it looks for all the classes that are annotated @Service and create an instance
//of them, load them to memory.....the objects are singletons so they are only created once and everytime
//we needs them we can ask spring for them and use them.... to ask for them we create a private variable to instruct
//spring to inject it into that class.... it is kept in memory to be used for dependency injection.
//and the reason is because it encapsulates the business logic which is almost always called , so
//instead of creating it everytime we just load it in memory and inject it as with the @Autowired annotation
/**
 * TopicService
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        // return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
        .forEach(topics :: add);
        return topics;
    }
    
    public Topic getTopic(String id){
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
         return topicRepository.findById(id).get();
    }

    
    //@RequestBody retrieve the object from the body.. it takes the requestbody and parse it and pass the corre. object to this method
    public void addTopic( Topic topic){
        // topics.add(topic);
        topicRepository.save(topic);
        
    }

    public void updateTopic(String id, Topic topic) {
        // for (int i = 0; i < topics.size(); i++) {
        //     Topic t = topics.get(i);
        //     if(t.getId().equals(id)){
        //         topics.set(i, topic);
        //         return;
        //     }
        // }
        topicRepository.save(topic);
    }

	public void deleteTopic(String id) {
        //removeIf() takes a predicate function like filter and remove all object that meets the condition of the 
        //predicate
        // topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
	}
}