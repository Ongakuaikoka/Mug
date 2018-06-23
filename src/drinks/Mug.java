package drinks;


class Mug<T extends Liquid> {
    	
	private T drink;
	private int volume = 250;
	private int content = 0;
	
	

	public void add(T drink) {
		this.drink = drink;
   }

	public T get() {
		return drink;
   }
	public void pour( int ml ) throws NotEnoughCapacityException{
		if (this.content + ml >= this.volume) {
			this.content = this.volume;
			throw new NotEnoughCapacityException ( "The cup is full!" );
		}
		else
			this.content += ml;
		}
	public void takeOut( int ml ) throws NotEnoughLiquidException{
		if (this.content - ml < 0) {
			this.content = 0;
			throw new NotEnoughLiquidException ( "Not enough liquid in the cup!" );
		}
		else 
			this.content -= ml;
		}
	
	public void drink(int ml) throws UndrinkableException, NotEnoughLiquidException{
		if (drink.isDrinkable() == false)
			throw new UndrinkableException ( "You can't drink that." );
		else if (this.content - ml < 0) {
			this.content = 0;
			throw new NotEnoughLiquidException ( "Not enough liquid in the cup!" );
		}
		else 
			this.content -= ml;
	}
	public int empty(){
		int amount = this.content;
		this.content = 0;
		return amount;
		
	}
	
	public boolean isEmpty(){
		if (this.content == 0)
			return true;
		else 
			return false;
	}
	
	public boolean isHot(){
		if (drink.getTemperature() > 60)
			return true;
		else 
			return false;
	}

}
