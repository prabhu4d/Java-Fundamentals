package io.spring.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

    // getAllTopics
    // getTopic
    // updateTopic
    // deleteTopic

    /**
     *
     * CrudRepository have all common CRUD operation,
     * if you want something just extend it
     */

}
