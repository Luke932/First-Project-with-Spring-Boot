package Luke932.First_Project_With_SpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBeans {

	@Bean
	String getHth() {
		return "Ciao Mondo";
	}
}
