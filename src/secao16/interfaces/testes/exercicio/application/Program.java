package secao16.interfaces.testes.exercicio.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao16.interfaces.testes.exercicio.model.entities.Contratc;
import secao16.interfaces.testes.exercicio.model.entities.Installment;
import secao16.interfaces.testes.exercicio.model.services.ContratctService;

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
		
		Contratc obj = new Contratc(numero, data, valorContrato);
		System.out.println(obj);
		
		System.out.print("Entre com o número de parcelas: ");
		int parcelas = Integer.parseInt(sc.nextLine());
		
		ContratctService service = new ContratctService();
		service.processContratc(obj, parcelas);
		
		sc.close();
	}

}
