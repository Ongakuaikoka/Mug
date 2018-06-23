package drinks;
import java.awt.Color;

public class Beer extends Liquid{
	String name;
	Color color;
	boolean drinkable;
	int temperature = 10;

	protected Beer(String name, Color color, boolean drinkable) {
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
		if (this.temperature > 60) {
			System.out.println("Why would you heat up beer?");
			return false;}
		else if (this.temperature > 20){
			System.out.println("Beer is disgudtingly warm");
			return false;}
		else if (this.temperature < 0){
			System.out.println("Your Beer is frozen");
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
