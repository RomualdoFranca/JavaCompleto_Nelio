package secao13.polimorfismo.myideias.exercicios.entities;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

	private LocalDate manufactureDate;

	public UsedProduct() {

	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

//	@Override
	public String priceTag() {
		//padrao de formatacao da data (dd/MM/yyyy
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + "(used) $ " + String.format("%.2f", getPrice()) + "(Manufecture date: "
				+ manufactureDate.format(formatter)
				+ ")");
		return sb.toString();
	}

}
