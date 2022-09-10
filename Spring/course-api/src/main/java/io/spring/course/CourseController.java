package io.spring.course;

import io.spring.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

  /**
   * 
   * @RestController - it converts any object into JSON format for Response
   * 
   */

  @Autowired
  private CourseService courseService;

  @RequestMapping("/topics/{id}/courses")
  public List<Course> getAllCourses(@PathVariable("id") String topicId) {
    return courseService.getAllCourses(topicId);
  }

  @RequestMapping("/topics/{id}/courses/{courseId}")
  public Optional<Course> getCourse(@PathVariable String courseId) {
    return courseService.getCourse(courseId);
  }

  @RequestMapping(value = "/topics/{topicId}/courses", method = RequestMethod.POST)
  public String addCourse(@RequestBody Course course, @PathVariable String topicId) {
    course.setTopic(new Topic(topicId, "", ""));
    courseService.addCourse(course);
    return "Successfully Topic Added";
  }

  @RequestMapping(value = "/topics/{topicId}/courses/{courseId}", method = RequestMethod.PUT)
  public String updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String courseId) {
    course.setTopic(new Topic(topicId, "",""));
    courseService.updateCourse(course);
    return "Successfully Topic Updated";
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{courseId}")
  public void deleteCourse(@PathVariable String courseId) {
    courseService.deleteCourse(courseId);
  }

}
