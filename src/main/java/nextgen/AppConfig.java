package nextgen;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

@Configuration
public class AppConfig {
	
	@Value("${dbname}")
	private String dbname = null;
	
	public @Bean MongoClient mongoClient() {
		return new MongoClient("localhost");
	}

	public @Bean MongoTemplate mongoTemplate() {
		System.out.println("DBNAME ---? " + dbname);
		return new MongoTemplate(mongoClient(), dbname);
	}

	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	
	
}
	