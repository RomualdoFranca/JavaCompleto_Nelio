package secao13.polimorfismo.myideias.exercicios.application;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import secao13.polimorfismo.myideias.exercicios.entities.ImportedProduct;
import secao13.polimorfismo.myideias.exercicios.entities.Product;
import secao13.polimorfismo.myideias.exercicios.entities.UsedProduct;

public class ApplicationProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//arrays para armazenar os objetos
		ArrayList<Product> listProduct = new ArrayList<Product>();
		
		System.out.print("Enter number of products:");
		int n = sc.nextInt();
		sc.nextLine();
		
		//loop para inserção dos dados e tipos de produto
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.println("Common, used or imported (c/u/i)?");
			char typeProduct = sc.next().charAt(0);
			sc.nextLine();
			
			//produtos comuns
			if(typeProduct == 'c') {
				System.out.print("Name:");
				String name = sc.nextLine();
//				sc.nextLine();
				System.out.print("Price:");
				double price = sc.nextDouble();
				sc.nextLine();
				//instancia objeto e adiciona a lista
				listProduct.add(new Product(name, price));
				
				//produtos usados
			}else if(typeProduct == 'u') {
				System.out.print("Name:");
				String name = sc.nextLine();
				System.out.print("Price:");
				double price = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				String date = sc.nextLine();
				
				//padrao de formatacao da data
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				//converte string num tipo date
				LocalDate localDate = LocalDate.parse(date, formatter);
				
				//instancia objeto e adiciona na lista
				listProduct.add(new UsedProduct(name, price, localDate)) ;
				
				//produtos importados
			}else {
				System.out.print("Name:");
				String name = sc.nextLine();
				System.out.print("Price:");
				double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("Custom fee:");
				double customFee = sc.nextDouble();
				sc.nextLine();
				
				//instancia objeto e adiciona na lista
				listProduct.add(new ImportedProduct(name, price, customFee));
			}
		}
		
		//imprime as etiquetas dos produtos
		for (Product product : listProduct) {
			System.out.println(product.priceTag());
		}
		
		
		sc.close();
	}

}
