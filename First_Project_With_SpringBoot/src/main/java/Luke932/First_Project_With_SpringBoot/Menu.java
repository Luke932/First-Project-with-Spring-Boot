package Luke932.First_Project_With_SpringBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Menu {
	private List<Pizza> menuItems = new ArrayList<>();

	public void addMenuItem(Pizza item) {
		if (item instanceof Margherita) {
			// Se l'item è una Margherita, crea una copia con il nuovo nome
			Margherita margherita = (Margherita) item;
			menuItems.add(margherita.createCopyWithNewName(margherita.getName()));
		} else {
			// Altrimenti aggiungi l'item senza modifiche
			menuItems.add(item);
		}
	}

	public void printMenu() {
		for (Pizza pizza : menuItems) {
			System.out.print(pizza.getName());
			List<String> toppings = new ArrayList<>(pizza.getToppings());
			if (!toppings.isEmpty()) {
				System.out.print(" (" + String.join(", ", toppings) + ")");
			}
			System.out.println("    " + pizza.getNutritionInfo() + "   " + pizza.getPrice() + " €");
		}
	}
}
