package drinks;

public class UndrinkableException extends Exception {
	String reason;
	 
	 public UndrinkableException(String reason)
	 {
		 super ("Contents error: ");
	 this.reason = reason;
	 
	 }
	}