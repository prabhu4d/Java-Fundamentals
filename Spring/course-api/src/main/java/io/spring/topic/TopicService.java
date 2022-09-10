package io.spring.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
  /**
   * Business Services are Singleton means when some controller need TopicService
   * it injects the Singleton Object of it
   */

  @Autowired
  private TopicRepository topicRepository;

  /**
   * ArrayList - mutable
   * Arrays.asList - Immutable
   */
  private List<Topic> topics = new ArrayList<>(Arrays.asList(
      new Topic("Spring", "Spring Framework", "Learning")));

  public List<Topic> getAllTopics() {
    List<Topic> topics = new ArrayList<>();
    topicRepository.findAll().forEach(topics::add);
    return topics;
  }

  public Optional<Topic> getTopic(String id) {
//    return topics.stream()
//        .filter(topic -> topic.getId().equals(id))
//        .findFirst().get();
      return topicRepository.findById(id);
  }

  public void addTopic(Topic topic) {
    topicRepository.save(topic);
  }

  public void updateTopic(String id, Topic topic) {
    topicRepository.save(topic);
  }

  public void deleteTopic(String id) {
//    topics.removeIf(t -> t.getId().equals(id));
      topicRepository.deleteById(id);
  }

}
