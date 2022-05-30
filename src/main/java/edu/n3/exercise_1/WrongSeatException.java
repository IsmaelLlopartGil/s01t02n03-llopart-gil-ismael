package edu.n3.exercise_1;

import java.io.IOException;

public class WrongSeatException extends IOException{

	private static final long serialVersionUID = -5630956768753760380L;
	
	public WrongSeatException() {
	}
	
	public WrongSeatException(String message) {
		super(message);
	}

}
