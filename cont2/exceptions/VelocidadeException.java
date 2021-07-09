package aula9.exceptions;

public class VelocidadeException extends RuntimeException{
	private String message;
	public VelocidadeException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
}
