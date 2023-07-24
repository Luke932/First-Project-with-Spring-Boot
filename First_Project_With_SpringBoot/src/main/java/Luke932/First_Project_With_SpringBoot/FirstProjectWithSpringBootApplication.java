package Luke932.First_Project_With_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class FirstProjectWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectWithSpringBootApplication.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				FirstProjectWithSpringBootApplication.class);
		log.info(ctx.getBean("getHth").toString());

		ctx.close();
	}

}
