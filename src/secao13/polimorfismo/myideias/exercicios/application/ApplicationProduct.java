package secao13.polimorfismo.myideias.exercicios.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import secao13.polimorfismo.myideias.exercicios.entities.ImportedProduct;
import secao13.polimorfismo.myideias.exercicios.entities.Product;
import secao13.polimorfismo.myideias.exercicios.entities.UsedProduct;

public class ApplicationProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Manufactore date (DD/MM/YYYY):");
		String data = sc.nextLine();
		
		//padrao de formatacao da data (dd/MM/yyyy
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//converte string para LocalDate
		LocalDate localDate = LocalDate.parse(data, formatter);
		
		
		Product prod01 = new Product("Notebook", 1100.00);
		System.out.println(prod01.priceTag());
		
		ImportedProduct prodImp01 = new ImportedProduct("Tablet", 280.00, 20.00);
		System.out.println(prodImp01.priceTag());
		
		UsedProduct prod = new UsedProduct("Iphone", 400.00, localDate);
		System.out.println(prod.priceTag());
		
		
		
		
		sc.close();
	}

}
