package drinks;
import java.awt.Color;

public class Coffee extends Liquid{
	String name;
	Color color;
	boolean drinkable;
	int temperature = 50;

	protected Coffee(String name, Color color, boolean drinkable) {
		super(name, color, drinkable);
		this.name = name;
		this.color = color;
		this.drinkable = drinkable;
	}


	public String getName() {
		return this.name;
	}


	public Color getColor() {
		return this.color;
	}


	public boolean isDrinkable() {
		if (this.temperature < 0) {
			System.out.println("Your coffee is frozen.");
			return false;}
		else if (this.temperature < 20) {
			System.out.println("Coffee's too cold.");
			return false;}
		else if (this.temperature > 60) {
			System.out.println("Coffee's too hot.");
			return false;}
		else
			return this.drinkable;
	}


	public void hitUp(int temperature) {
		this.temperature += temperature;
	}

	public int getTemperature() {
		return this.temperature;
	}

}
