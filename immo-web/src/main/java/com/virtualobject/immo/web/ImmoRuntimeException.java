package com.virtualobject.immo.web;

public class ImmoRuntimeException extends RuntimeException {

	public ImmoRuntimeException() {
	}

	public ImmoRuntimeException(String message) {
		super(message);
	}

	public ImmoRuntimeException(Throwable cause) {
		super(cause);
	}

	public ImmoRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public ImmoRuntimeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
