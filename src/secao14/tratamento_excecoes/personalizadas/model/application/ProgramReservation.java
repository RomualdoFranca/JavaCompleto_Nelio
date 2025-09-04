package secao14.tratamento_excecoes.personalizadas.model.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import secao14.tratamento_excecoes.personalizadas.model.entities.Reservation;
import secao14.tratamento_excecoes.personalizadas.model.exception.DomainException;

public class ProgramReservation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			//lendo os dados da reserva
			System.out.print("Room number: ");
			int number = Integer.parseInt(sc.nextLine());
			System.out.print("Check-in date (dd/mm/yyyy): ");
			LocalDate checkin = LocalDate.parse(sc.nextLine(), dtf);
			System.out.print("Check-out date (dd/mm/yyyy): ");
			LocalDate checkout = LocalDate.parse(sc.nextLine(), dtf);
			
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation: " + reservation);
			
			//atualização dos dados da reserva
			System.out.println();
			System.out.println("Enter data to update the reservation");
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkin = LocalDate.parse(sc.nextLine(), dtf);
			System.out.print("Check-out date (dd/mm/yyyy): ");
			checkout = LocalDate.parse(sc.nextLine(), dtf);
			
			reservation.updateDates(checkin, checkout);
			System.out.println("Reservation: " + reservation);
		}
		//blocos catch com exceções padrão do Java
		catch (DateTimeParseException  e) {
			System.out.println("Invalid data format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
			
		}
		sc.close();
	}

}
