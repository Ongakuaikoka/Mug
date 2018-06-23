package drinks;

public class NotEnoughLiquidException extends Exception {
	 String reason;
	 
	 public NotEnoughLiquidException(String reason)
	 {
		 super ("Contents error: ");
	 this.reason = reason;
	 
	 }
	}