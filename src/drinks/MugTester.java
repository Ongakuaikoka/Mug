package drinks;
import java.awt.Color;


public class MugTester {    
   public static void main(String[] args) {
      Mug<Beer> beerMug = new Mug<Beer>();
      Mug<Beer> beerMug2 = new Mug<Beer>();
      Mug<Coffee> coffeeMug = new Mug<Coffee>();

      beerMug.add(new Beer("Guinness", Color.BLACK, true));
      beerMug2.add(new Beer("Becks", Color.YELLOW, false));
      coffeeMug.add(new Coffee("Latte", Color.decode("#a37351"), true));
      
      // Beer tests
      System.out.println("BEER TEST:");
      Beer beer = beerMug.get();
      System.out.println(beer.getName());     
      System.out.println("Drinkable = " + beer.isDrinkable());
      System.out.println("Empty = " + beerMug.isEmpty());
      
      try {
		beerMug.pour(100);
	} catch (NotEnoughCapacityException e) {
		System.out.println( e.getMessage() + e.reason );
		}
      System.out.println("Empty = " + beerMug.isEmpty());
      
      try {
  		beerMug.pour(200);
  	} catch (NotEnoughCapacityException e) {
  		System.out.println( e.getMessage() + e.reason );
  		}
      try {
     		beerMug.takeOut(300);
    } catch (NotEnoughLiquidException e) {
  		System.out.println( e.getMessage() + e.reason );
     	}
      System.out.println("Empty = " + beerMug.isEmpty());
      
      try {
  		beerMug2.pour(100);
  	} catch (NotEnoughCapacityException e) {
  		System.out.println( e.getMessage() + e.reason );
  	} 
      try {
    	beerMug2.drink(100);
    } catch (UndrinkableException e) {
 		System.out.println( e.getMessage() + e.reason );}
      catch (NotEnoughLiquidException e) {
    	System.out.println(e.getMessage() + e.reason);
    	}
      
      // coffee tests
      System.out.println("\nCOFFEE TEST:");
      Coffee coffee = coffeeMug.get();
      System.out.println(coffee.getName());     
      System.out.println("Drinkable = " + coffee.isDrinkable());
      System.out.println("Empty = " + coffeeMug.isEmpty());
      try {
  		coffeeMug.drink(100);
    } catch (UndrinkableException e) {
		System.out.println( e.getMessage() + e.reason );}
      catch (NotEnoughLiquidException e) {
    	System.out.println(e.getMessage() + e.reason);
  	}
      try {
  		coffeeMug.pour(100);
  	} catch (NotEnoughCapacityException e) {
  		System.out.println( e.getMessage() + e.reason );
  		}
      
      System.out.println("Temperature = " + coffee.getTemperature());
      System.out.println("Hot = " + coffeeMug.isHot()); 
      coffee.hitUp(30);
      System.out.println("Temperature = " + coffee.getTemperature());
      System.out.println("Hot = " + coffeeMug.isHot()); 
   }
}
