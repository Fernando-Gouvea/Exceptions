package Model.Exceptions;

public class DomainException extends RuntimeException{
	private static final long serialersionUID = 1L;
	
	public DomainException(String msgu) {
		super(msgu);
	}
}
