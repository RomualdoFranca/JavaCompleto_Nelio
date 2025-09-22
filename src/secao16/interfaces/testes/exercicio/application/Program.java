package secao16.interfaces.testes.exercicio.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import secao16.interfaces.testes.exercicio.model.entities.Contratc;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados:");
		System.out.print("Número: ");
		int numero = Integer.parseInt(sc.nextLine());
		
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.nextLine(), dtf);
		
		System.out.print("Valor do contrato: ");
		double valorContrato = Double.parseDouble(sc.nextLine());
		
		System.out.print("Entre com o número de parcelas: ");
		int parcelas = Integer.parseInt(sc.nextLine());
		
		Contratc obj = new Contratc(numero, data, valorContrato);
		System.out.println(obj);
		
		sc.close();
	}

}
