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

		// Esercizio1
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				FirstProjectWithSpringBootApplication.class);
		log.info(ctx.getBean("getHth").toString());

		// Esercizio2
		Margherita margherita = new Margherita();
		ctx.getBean(Menu.class).addMenuItem(margherita);

		Margherita customMargherita = new Margherita();
		customMargherita.setName("4Gusti");
		customMargherita.addToppings("Prosciutto");
		customMargherita.addToppings("Wurstel");
		customMargherita.addToppings("Funghi");
		ctx.getBean(Menu.class).addMenuItem(customMargherita);

		ctx.getBean(Menu.class).printMenu();

		ctx.close();
	}

}
