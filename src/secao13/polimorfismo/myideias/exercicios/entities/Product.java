package secao13.polimorfismo.myideias.exercicios.entities;

public class Product {

	private String name;
	private Double price;
	
	public Product() {//construtor padrão
		
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}
	
	public String priceTag() {
		return String.format("%s $ %.2f", getName(), getPrice());
//		StringBuilder sb = new StringBuilder();
//		sb.append(getName() + " $ " + String.format("%.2f", getPrice()));
	}
	
}
