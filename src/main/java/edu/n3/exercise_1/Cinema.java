package edu.n3.exercise_1;

import com.liche.utils.console.menu.ConsoleMenu;
import com.liche.utils.io.Input;

public class Cinema {

	private int rows;
	private int seatsPerRow;
	private SeatHandler seatHandler;

	public Cinema() {
		seatHandler = new SeatHandler();
		requestData();
	}

	public void launch() {
	
		ConsoleMenu mainMenu = loadMainMenu();
		String userOption = "";
	
		do {
			userOption = mainMenu.run();
			runCommand(userOption);
		} while (userOption != "Sortir");
	
	}

	private void requestData() {
		rows = Input.readPositiveInt("Introdueix el nombre de files: ");
		seatsPerRow = Input.readPositiveInt("Introdueix el nombre de seients per fila: ");
	}

	private ConsoleMenu loadMainMenu() {
		ConsoleMenu mainMenu = new ConsoleMenu();
		mainMenu.addOption("Mostrar totes les butaques reservades");
		mainMenu.addOption("Mostrar les butaques reservades per una persona");
		mainMenu.addOption("Reservar una butaca");
		mainMenu.addOption("Anul·lar la reserva d’una butaca");
		mainMenu.addOption("Anul·lar totes les reserves d’una persona");
		mainMenu.addOption("Sortir");
		return mainMenu;
	}

	private void runCommand(String command) {

		switch (command) {

		case "Mostrar totes les butaques reservades":
			showSeats();
			break;

		case "Mostrar les butaques reservades per una persona":
		//	showCustomerSeats();
			break;

		case "Reservar una butaca":
		//	seatReservation();
			break;

		case "Anul·lar la reserva d’una butaca":
		//	cancelSeatReservation();
			break;

		case "Anul·lar totes les reserves d’una persona":
	//		cancelAllSeatReservation();
			break;

		default:
		}
	}
	
	private void showSeats() {
	}

	private String addCustomer() throws WrongPersonNameException  {
		String customer=Input.readString("Introdueix el nom: ");
		
		for (int i=0; i<customer.length(); i++) {
			
			if (Character.isDigit(customer.charAt(i))) {
				throw new WrongPersonNameException("El nom no pot contenir números.");
			}
		}
		
		return customer;
	}
	
	private int addRow() throws WrongRowException {
		int row=Input.readInt("Introdueix la fila: ");
		
		if (row<=0 && row > rows) {
			throw new WrongRowException("La fila no existeix.");
		}
		
		return row;
	}
	
	private int addSeat() throws WrongSeatException {
		int seat=Input.readInt("Introdueix la fila: ");
		
		if (seat<=0 && seat > seatsPerRow) {
			throw new WrongSeatException("El seient no existeix.");
		}
		
		return seat;
	}
}
