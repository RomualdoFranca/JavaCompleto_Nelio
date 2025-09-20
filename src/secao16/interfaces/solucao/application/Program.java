package secao16.interfaces.solucao.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import secao16.interfaces.solucao.model.entities.CarRental;
import secao16.interfaces.solucao.model.entities.Vehicle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// HH maiusculo para considerar o formato 24 horas
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();

		System.out.print("Retirada (dd/MM/yyyy hh:mm)");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);

		System.out.print("Retorno (dd/MM/yyyy hh:mm)");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

		// o modelo do carro é uma string (carModel), porem, no construtor do CarRental,
		// o paramentro do construtor é do tipo Vehicle devido a associação
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		sc.close();

	}

}
