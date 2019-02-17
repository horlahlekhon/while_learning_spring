package io.sisyphus.springbootstarter.topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopic() {

        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {

        return topicService.getTopic(id);
    }

    // this is how to do post request
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    // @RequestBody retrieve the object from the body.. it takes the requestbody and
    // parse it and pass the corre. object to this method
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);

    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
    public String updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
        return "yes it is modified";
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public String deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
        return "yes it is deleted";
    }
}