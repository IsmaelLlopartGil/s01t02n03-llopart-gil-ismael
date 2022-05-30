package edu.n3.exercise_1;

import java.util.Objects;

public class Seat {

	private int rowNumber;
	private int seatNumber;
	private String customer;

	public Seat(int rowNumber, int seatNumber, String customer) {
		this.rowNumber = rowNumber;
		this.seatNumber = seatNumber;
		this.customer = customer;
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public String getCustomer() {
		return customer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rowNumber, seatNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		return rowNumber == other.rowNumber && seatNumber == other.seatNumber;
	}

	@Override
	public String toString() {
		return "Fila: " + rowNumber + ", Seient: " + seatNumber + ", Persona: " + customer + ".\n";
	}
}
