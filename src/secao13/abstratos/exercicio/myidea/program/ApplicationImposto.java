package secao13.abstratos.exercicio.myidea.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao13.abstratos.exercicio.myidea.entities.Contribuintes;
import secao13.abstratos.exercicio.myidea.entities.PessoaFisica;
import secao13.abstratos.exercicio.myidea.entities.PessoaJuridica;

public class ApplicationImposto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter number of tax payers:");
		//Quando você usa sc.nextLine(), o método lê toda a linha de entrada,
		//incluindo a quebra de linha que o usuário digita ao apertar
		//"Enter", e retorna o resultado como uma String.
		int taxPayers = Integer.parseInt(sc.nextLine());//o Integer.parseInt() converte a string em um inteiro
		
		List<Contribuintes> payersList = new ArrayList<Contribuintes>();
 		
		for (int i = 1; i <= taxPayers; i++) {
			System.out.println("Idividual or Company (i/c) ?");
			char taxPayersType = sc.nextLine().charAt(0);
			
			if(taxPayersType == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				
				System.out.print("Anual income: ");
				double anualIncome = Double.parseDouble(sc.nextLine());
				
				System.out.print("Health expenditures: ");
				double healthExpenditures = Double.parseDouble(sc.nextLine());
				
				payersList.add(new PessoaFisica(name, anualIncome, healthExpenditures));
				
			}else {
				System.out.print("Name: ");
				String name = sc.nextLine();
				
				System.out.print("Anual income: ");
				double anualIncome = Double.parseDouble(sc.nextLine());
				
				System.out.print("Number of employees: ");
				int employeeNumber = Integer.parseInt(sc.nextLine());
				
				payersList.add(new PessoaJuridica(name, anualIncome, employeeNumber));
			}//fim do if-else
			
		}//fim do loop
		
		System.out.println("TAXES PAID:\n");
		
		for (Contribuintes contribuintes : payersList) {
			System.out.println(contribuintes);
		}
		sc.close();
		
		System.out.print("TOTAL TAXES: $ ");
		double sum = 0;
		for (Contribuintes contribuintes : payersList) {
			sum += contribuintes.calculaImposto();
		}
		System.out.println(sum);
		
		
		
	}//fim do main

}//fim da classe
