package edu.n3.exercise_1;

import java.io.IOException;

public class WrongPersonNameException extends IOException {

	private static final long serialVersionUID = 6331422284848966373L;

	public WrongPersonNameException() {}
	
	public WrongPersonNameException(String message) {
		super(message);
	}
}
