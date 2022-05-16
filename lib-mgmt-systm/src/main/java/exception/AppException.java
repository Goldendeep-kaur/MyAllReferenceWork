package exception;

public class AppException extends Exception {
	@Override
	public String getMessage() {
		
		return "This Application is under maintenance. Sorry for any inconvience...";
	}
}
