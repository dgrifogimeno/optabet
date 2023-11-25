package com.davidgrifogimeno.optabet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;

// import com.davidgrifogimeno.optabet.models.Team;
// import com.davidgrifogimeno.optabet.repositories.TeamRepository;

@SpringBootApplication
public class OptabetApplication extends ServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OptabetApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner populateDB(TeamRepository repository) {
		return (args) -> {
			repository.save(new Team(0L, "Team0", "T0", "WWW", 8, 5, 3));
		};
	}*/
}
