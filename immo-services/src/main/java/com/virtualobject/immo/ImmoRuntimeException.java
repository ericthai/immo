package com.virtualobject.immo;

public class ImmoRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 183262916716068209L;

	public ImmoRuntimeException() {
	}

	public ImmoRuntimeException(String arg0) {
		super(arg0);
	}

	public ImmoRuntimeException(Throwable arg0) {
		super(arg0);
	}

	public ImmoRuntimeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ImmoRuntimeException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
