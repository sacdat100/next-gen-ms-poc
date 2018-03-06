package nextgen;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserActivityRepository extends MongoRepository<UserActivity, String>{
	
	public List<UserActivity> findByActionByGroup(String actionByGroup);
	
	public List<UserActivity> findByActionByUser(String actionByGroup, String actionByName);
}
