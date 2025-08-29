package secao13.polimorfismo.myideias.exercicios.entities;

public class ImportedProduct extends Product{

	private Double customsFee;
	
	public ImportedProduct() {//construtor padrao
		
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}
	public double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.priceTag() + "(Customs fee: $ " + String.format("%.2f", getCustomsFee()) + ")");
		return sb.toString();
	}
	
	
	
	
}
