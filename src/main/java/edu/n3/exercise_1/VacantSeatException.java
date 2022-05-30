package edu.n3.exercise_1;

public class VacantSeatException extends Exception{

	private static final long serialVersionUID = 4663293040289806558L;
	
	public VacantSeatException() {
	}
	
	public VacantSeatException(String message) {
		super(message);
	}
}
