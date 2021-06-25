package br.com.devinhouse.exception;

public class GenericException extends RuntimeException {

	private static final long serialVersionUID = -3760635424924281953L;

	public GenericException() {
		super();
	}

	public GenericException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public GenericException(String message, Throwable cause) {
		super(message, cause);
	}

	public GenericException(String message) {
		super(message);
	}

	public GenericException(Throwable cause) {
		super(cause);
	}

}
