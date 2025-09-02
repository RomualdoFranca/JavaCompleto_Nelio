package secao13.polimorfismo.myideias.exercicios.entities;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input inteiro");
		int inteiro = Integer.parseInt(sc.nextLine());
		System.out.println("Input double");
		System.out.println("Input char");

		Product prod01 = new Product("tv", 100.00);
		System.out.println("Chamada do método getName(): " + prod01.getName());
		System.out.println("Chamada do método priceTag(): " + prod01.priceTag());
		
		Product prod02 = new ImportedProduct("Tablet", 450.00, 100.00);
		System.out.println("Chamada do método priceTag(): " + prod02.priceTag());
		
		sc.close();
	}

}
