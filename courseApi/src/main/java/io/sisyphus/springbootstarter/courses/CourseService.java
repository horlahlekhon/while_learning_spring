package io.sisyphus.springbootstarter.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

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
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses( String id){
        // return courses;
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(id)
        .forEach(courses :: add);
        return courses;
    }
    
    public Course getCourse(String id){
        // return courses.stream().filter(t -> t.getId().equals(id)).findFirst().get();
         return courseRepository.findById(id).get();
    }

    
    //@RequestBody retrieve the object from the body.. it takes the requestbody and parse it and pass the corre. object to this method
    public void addCourse( Course topic){
        // courses.add(topic);
        courseRepository.save(topic);
        
    }

    public void updateCourse(String id, Course topic) {
        // for (int i = 0; i < courses.size(); i++) {
        //     Course t = courses.get(i);
        //     if(t.getId().equals(id)){
        //         courses.set(i, topic);
        //         return;
        //     }
        // }
        courseRepository.save(topic);
    }

	public void deleteCourse(String id) {
        //removeIf() takes a predicate function like filter and remove all object that meets the condition of the 
        //predicate
        // courses.removeIf(t -> t.getId().equals(id));
        courseRepository.deleteById(id);
	}
}