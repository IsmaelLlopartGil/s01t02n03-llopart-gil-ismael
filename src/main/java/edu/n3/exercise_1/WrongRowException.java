package edu.n3.exercise_1;

import java.io.IOException;

public class WrongRowException extends IOException {

	private static final long serialVersionUID = -5159110757794421138L;
	
	public WrongRowException() {
	}
	
	public WrongRowException(String message) {
		super(message);
	}

}
