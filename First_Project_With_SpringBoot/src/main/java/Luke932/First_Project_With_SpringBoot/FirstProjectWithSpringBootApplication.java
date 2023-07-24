package Luke932.First_Project_With_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class FirstProjectWithSpringBootApplication {

	public static void main(String[] args) {
		// Esercizio1
		log.info("Ciao Mondo");
		SpringApplication.run(FirstProjectWithSpringBootApplication.class, args);
	}

}
