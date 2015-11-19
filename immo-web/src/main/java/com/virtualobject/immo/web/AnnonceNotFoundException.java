package com.virtualobject.immo.web;

public class AnnonceNotFoundException extends ImmoRuntimeException {

	private static final long serialVersionUID = -2537573750485701664L;

	public AnnonceNotFoundException() {
	}

	public AnnonceNotFoundException(String arg0) {
		super(arg0);
	}

	public AnnonceNotFoundException(Throwable arg0) {
		super(arg0);
	}

	public AnnonceNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public AnnonceNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
