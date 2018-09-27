package logofatu.galina.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface CourseRepository extends CrudRepository<Course, String> {
	
	// getAllTopics()
	// getTopic(String id)
	// updateTopic(Topic t)
	// deleteTopic(String id)
	
    default Course findOne(String id) { 
        return (Course)findById(id).orElse(null); 
    } 
    
    public List<Course> findByName(String name);
    public List<Course> findByDescription(String foo);
    public List<Course> findByTopicId(String topicId);
    
}
