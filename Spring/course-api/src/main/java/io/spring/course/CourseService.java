package io.spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
  /**
   * Business Services are Singleton means when some controller need TopicService
   * it injects the Singleton Object of it
   */

  @Autowired
  private CourseRepository courseRepository;

  public List<Course> getAllCourses(String topicId) {
    return new ArrayList<>(courseRepository.findByTopicId(topicId));
  }

  public Optional<Course> getCourse(String id) {
//    return topics.stream()
//        .filter(topic -> topic.getId().equals(id))
//        .findFirst().get();
      return courseRepository.findById(id);
  }

  public void addCourse(Course course) {
    courseRepository.save(course);
  }

  public void updateCourse(Course course) {
    courseRepository.save(course);
  }

  public void deleteCourse(String id) {
//    topics.removeIf(t -> t.getId().equals(id));
      courseRepository.deleteById(id);
  }

}
