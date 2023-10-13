package Exception;

import java.util.*;

public class NegativeDiameterException extends Exception{

	private int exceptionCode;
	private String message;

	public NegativeDiameterException() {
		this.exceptionCode = 788900;
		this.message = "NegativeDiameterException";
	}

	public NegativeDiameterException(int exceptionCode, String message) {

		this.exceptionCode = exceptionCode;
		this.message = message;
	}

	public int getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(int exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "NegativeDiameterException [ExceptionCode=" + exceptionCode + ", Message=" + message + "]";
	}

}
