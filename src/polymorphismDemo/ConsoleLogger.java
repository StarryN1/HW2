package polymorphismDemo;

public class ConsoleLogger extends BaseLogger {
	public void l(String message) {
		System.out.println("Logged to console:"+ message);
	}

}
