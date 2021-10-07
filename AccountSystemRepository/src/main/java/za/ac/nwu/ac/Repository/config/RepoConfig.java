package za.ac.nwu.repo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("za.ac.nwu.ac.Repository.persistence") //5. scan for the repos
@EntityScan("za.ac.nwu.ac.domain.persistence") //4. scan for the entities
@PropertySource(value = "classpath:application-db.properties")
public class RepoConfig {

}