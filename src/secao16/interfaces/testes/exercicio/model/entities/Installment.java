package secao16.interfaces.testes.exercicio.model.entities;

import java.time.LocalDate;

public class Installment {//parcelas
	
	private LocalDate dueDate; //data de vencimento
	private Double amount;
	
	public Installment() {
		
	}

	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	
}
