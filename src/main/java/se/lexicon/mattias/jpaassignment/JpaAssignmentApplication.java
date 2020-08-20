package se.lexicon.mattias.jpaassignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.lexicon.mattias.jpaassignment.entity.Ingredient;
import se.lexicon.mattias.jpaassignment.util.Measurement;

@SpringBootApplication
public class JpaAssignmentApplication implements CommandLineRunner {

	@Autowired
	Ingredient ingredient;

	public static void main(String[] args) {
		SpringApplication.run(JpaAssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



	}
}
