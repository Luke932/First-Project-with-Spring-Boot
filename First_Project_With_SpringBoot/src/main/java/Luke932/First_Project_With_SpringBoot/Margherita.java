package Luke932.First_Project_With_SpringBoot;

import java.util.ArrayList;
import java.util.List;

public class Margherita implements Pizza {
	private List<String> toppings = new ArrayList<>();
	private String size;

	public Margherita() {
		size = "Standard";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Margherita";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Pomodoro e mozzarella";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 8.00;
	}

	@Override
	public String getNutritionInfo() {
		// TODO Auto-generated method stub
		return "90 calorie";
	}

	@Override
	public List<String> getToppings() {
		// TODO Auto-generated method stub
		return toppings;
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	public void addToppings(String topping) {
		toppings.add(topping);
	}

	public void setSize(String size) {
		this.size = size;
	}

}
