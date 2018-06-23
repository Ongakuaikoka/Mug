package drinks;

public class NotEnoughCapacityException extends Exception {
	 String reason;
	 
	 public NotEnoughCapacityException(String reason)
	 {
		 super ("Contents error: ");
	 this.reason = reason;
	 
	 }
	}