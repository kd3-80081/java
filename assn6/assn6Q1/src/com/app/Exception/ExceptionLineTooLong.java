package com.app.Exception;

public class ExceptionLineTooLong extends RuntimeException{
	private int exceptionCode;
	private String message;

	public ExceptionLineTooLong() {
		this.exceptionCode = 10091;
		this.message = "ExceptionStringTooLong";
	}

	public ExceptionLineTooLong(int exceptionCode, String message) {

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
		return "ExceptionLineTooLong [exceptionCode=" + exceptionCode + ", message=" + message + "]";
	}
	
	

}
