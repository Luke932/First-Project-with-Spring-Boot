package Luke932.First_Project_With_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@ComponentScan("Luke932.First_Project_With_SpringBoot")
@Slf4j
public class FirstProjectWithSpringBootApplication {

	@Autowired
	private Menu menu;

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectWithSpringBootApplication.class, args);

		// Esercizio1
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				FirstProjectWithSpringBootApplication.class);
		log.info(ctx.getBean("getHth").toString());

		FirstProjectWithSpringBootApplication app = ctx.getBean(FirstProjectWithSpringBootApplication.class);
		app.run();

		ctx.close();
	}

	public void run() {
		AnnotationConfigApplicationContext ctz = new AnnotationConfigApplicationContext(MenuConfig.class);

		menu.addMenuItem(ctz.getBean("Margherita", Margherita.class));
		Margherita customMargherita = (Margherita) ctz.getBean("createMargherita", Margherita.class, "4Gusti",
				ctz.getBean("pomodoro", Topping.class), ctz.getBean("mozzarella", Topping.class));
		customMargherita.addTopping(ctz.getBean("prosciutto", Topping.class));
		customMargherita.addTopping(ctz.getBean("wurstel", Topping.class));
		customMargherita.addTopping(ctz.getBean("funghi", Topping.class));
		menu.addMenuItem(customMargherita);

		menu.printMenu();

		ctz.close();
	}
}
