package io.sisyphus.springbootstarter.courses;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import io.sisyphus.springbootstarter.topic.*;


@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("topics/{topicId}/courses")
    public List<Course> getAllcourse(@PathVariable String topicId) {

        return courseService.getAllCourses(topicId);
    }

    @RequestMapping("topic/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable  String  id){

        return courseService.getCourse(id);
    }

     //this is how to do post request
     @RequestMapping(method=RequestMethod.POST, value="topics/{id}/courses")
     //@RequestBody retrieve the object from the body.. it takes the requestbody and parse it and pass the corre. object to this method
     public void addCourse(@RequestBody Course course, @PathVariable String id){
         course.setTopic(new Topic(id, "", ""));
         courseService.addCourse(course);
         
     }

     @RequestMapping(value="topics/{id}/courses/{id}", method=RequestMethod.PUT)
     public String updateCourse(@RequestBody Course course, @PathVariable String id) {
        course.setTopic(new Topic(id, "", ""));
         courseService.addCourse(course);
        return "yes it is modified";
     }


     @RequestMapping(value="topics/{topicId}/courses/{id}", method=RequestMethod.DELETE)
     public String deletecourse(@PathVariable String id) {
        courseService.deleteCourse(id);
        return "yes it is deleted";
     }    
}