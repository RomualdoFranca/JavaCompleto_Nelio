package secao13.polimorfismo.myideias.exercicios.application;

import java.util.Locale;

import secao13.polimorfismo.myideias.exercicios.entities.ImportedProduct;
import secao13.polimorfismo.myideias.exercicios.entities.Product;

public class ApplicationProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Product prod01 = new Product("Notebook", 1100.00);
		System.out.println(prod01.priceTag());
		
		ImportedProduct prodImp01 = new ImportedProduct("Tablet", 280.00, 20.00);
		System.out.println(prodImp01.priceTag());
	}

}
