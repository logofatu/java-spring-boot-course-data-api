package logofatu.galina.springbootstarter.topic;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.NoRepositoryBean;

public interface TopicRepository extends CrudRepository<Topic, String> {

	
	// getAllTopics()
	// getTopic(String id)
	// updateTopic(Topic t)
	// deleteTopic(String id)
	
    default Topic findOne(String id) { 
        return (Topic)findById(id).orElse(null); 
    } 
}
