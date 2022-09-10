package io.spring.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String>{

    // getAllTopics
    // getTopic
    // updateTopic
    // deleteTopic

    /**
     *
     * CrudRepository have all common CRUD operation,
     * if you want something just extend it
     */

//    find variable is a format for query, JPA automatically guess what to query by name
//    List<Course> findByName(String name);

    List<Course> findByTopicId(String topicId);

}
