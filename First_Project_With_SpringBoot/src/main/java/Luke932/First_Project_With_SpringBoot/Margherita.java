package Luke932.First_Project_With_SpringBoot;

import java.util.ArrayList;
import java.util.List;

public class Margherita implements Pizza {
	private List<String> toppings = new ArrayList<>();
	private String size;
	private String name = "Margherita"; // Nome predefinito

	public Margherita() {
		size = "Standard";
		addToppings("pomodoro");
		addToppings("mozzarella");
	}

	public Margherita createCopyWithNewName(String name) {
		Margherita copiedPizza = new Margherita();
		copiedPizza.setName(name);
		copiedPizza.setSize(this.getSize());
		copiedPizza.setToppings(new ArrayList<>(this.getToppings())); // Copia gli ingredienti senza ripetizioni
		return copiedPizza;
	}

	@Override
	public String getName() {
		return name; // Restituisce il nome impostato con setName() o "Margherita" se non è stato
						// impostato
	}

	@Override
	public String getDescription() {
		return "Pomodoro e mozzarella";
	}

	@Override
	public double getPrice() {
		double basePrice = 8.0;
		return basePrice + toppings.size() * 1.5;
	}

	@Override
	public String getNutritionInfo() {
		return "90 calorie";
	}

	@Override
	public List<String> getToppings() {
		return toppings;
	}

	@Override
	public String getSize() {
		return size;
	}

	public void addToppings(String topping) {
		toppings.add(topping);
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Aggiungi questo metodo per impostare la nuova lista di ingredienti
	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}
}
