package myIdeas.secao14.excecoes.model.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import myIdeas.secao14.excecoes.model.entities.Reservation;

public class AppReservation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		List<Reservation> reservations = insereDadosReserva(sc, dtf);
		imprimeLista(reservations);

	}

	public static List<Reservation> insereDadosReserva(Scanner sc, DateTimeFormatter dtf) {
		System.out.print("Número do quarto: ");
		var numQuarto = Integer.parseInt(sc.nextLine());

		System.out.print("Data de entrada (dd/mm/yyyy):");
		var entrada = LocalDate.parse(sc.nextLine(), dtf);
		System.out.print("Data de saída (dd/mm/yyyy):");
		var saida = LocalDate.parse(sc.nextLine(), dtf);
		
		List<Reservation> listaReservas = criaListaReservas(numQuarto, entrada, saida);
		return listaReservas;
		
	}

	public static List<Reservation> criaListaReservas(int quarto, LocalDate entrada, LocalDate saida) {
		List<Reservation> listaReservas = new ArrayList<Reservation>();
		listaReservas.add(new Reservation(quarto, entrada, saida));
		return listaReservas;

	}
	
	public static void imprimeLista(List<Reservation> listaReservas) {
		for (Reservation reservation : listaReservas) {
			System.out.println(reservation);
		}
	}

}
