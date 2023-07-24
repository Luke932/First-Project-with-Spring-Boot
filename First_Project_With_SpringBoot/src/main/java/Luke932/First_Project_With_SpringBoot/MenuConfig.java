package Luke932.First_Project_With_SpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfig {

	// Esercizio2
	@Bean
	public Topping Prosciutto() {
		return new Prosciutto();
	}

	@Bean
	public Topping Wurstel() {
		return new Wurstel();
	}

	@Bean
	public Topping Patatine() {
		return new Patatine();
	}

	@Bean
	public Topping Funghi() {
		return new Funghi();
	}

	@Bean
	public Topping Bufala() {
		return new Bufala();
	}

	@Bean
	public Pizza Margherita() {
		return createMargherita("Margherita");
	}

	@Bean
	public Pizza createMargherita(String name) {
		Margherita margherita = new Margherita();
		margherita.setName(name);
		return margherita;
	}

}
