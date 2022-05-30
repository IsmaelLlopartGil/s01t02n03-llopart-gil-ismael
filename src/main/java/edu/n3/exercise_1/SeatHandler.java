package edu.n3.exercise_1;

import java.util.*;

public class SeatHandler {

	private List<Seat> seatList;

	public SeatHandler() {
		seatList = new ArrayList<>();
	}

	public List<Seat> getSeatList() {
		return seatList;
	}

	public void addSeat(Seat seat) throws OccupiedSeatException {
		assert seat != null;

		if (findSeat(seat.getRowNumber(), seat.getSeatNumber()) == -1) {
			seatList.add(seat);
		} else {
			throw new OccupiedSeatException("La butaca està ocupada.");
		}
	}

	private int findSeat(int row, int seatNumber) {
		int index = -1;

		for (int i = 0; i < seatList.size(); i++) {

			if (seatList.get(i).getRowNumber() == row && seatList.get(i).getSeatNumber() == seatNumber) {
				index = i;
			}
		}
		return index;
	}

	public void removeSeat(int row, int seatNumber) throws VacantSeatException {
		int index = findSeat(row, seatNumber);

		if (index != -1) {
			seatList.remove(index);
		} else {
			throw new VacantSeatException("La butaca ja està lliure.");
		}
	}

	public List<Seat> getCustomerSeats(String customer) {
		List<Seat> customerSeatList = new ArrayList<>();

		for (int i = 0; i < seatList.size(); i++) {

			if (seatList.get(i).getCustomer().equals(customer)) {
				customerSeatList.add(seatList.get(i));
			}
		}

		return customerSeatList;
	}
}
