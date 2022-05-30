package edu.n3.exercise_1;

public class OccupiedSeatException extends Exception {

	private static final long serialVersionUID = -1261937257758169038L;

	public OccupiedSeatException() {}
	
	public OccupiedSeatException(String message) {
		super(message);
	}
	
}
