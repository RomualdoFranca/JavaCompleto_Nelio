package secao13.polimorfismo.myideias.exercicios.entities;

public class Teste {

	public static void main(String[] args) {

		Product prod01 = new Product("tv", 100.00);
		System.out.println("Chamada do método getName(): " + prod01.getName());
		System.out.println("Chamada do método priceTag(): " + prod01.priceTag());
		
		Product prod02 = new ImportedProduct("Tablet", 450.00, 100.00);
		System.out.println("Chamada do método priceTag(): " + prod02.priceTag());
	}

}
