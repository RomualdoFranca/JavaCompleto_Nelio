package secao16.interfaces.exercicio.correcao.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private Integer number;
	private LocalDate date;
	private Double totalValue;
	//no diagrama UML mostra que o contrato tem várias associações indicada pelo asterístico no diagrama
	//quando isso ocorrer, significa que temos de ter uma lista para representar essas várias associações
	private List<Installment> installments = new ArrayList<Installment>();
	
	public Contract() {
		
	}

	//o construtor foi instanciado sem as parcelas porque ao instanciar um contrato, ainda nao se tem as parcelas 
	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
	
	
	
}
