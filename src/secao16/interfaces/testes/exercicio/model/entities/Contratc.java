package secao16.interfaces.testes.exercicio.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contratc {
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	private Installment installment;// composição

//	public Contratc(Integer number, LocalDate date, Double totalValue, Installment installment) {
//		this.number = number;
//		this.date = date;
//		this.totalValue = totalValue;
//		this.installment = installment;
//	}
	public Contratc(Integer number, LocalDate date, Double totalValue) {
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

	public Installment getInstallment() {
		return installment;
	}

	public void setInstallment(Installment installment) {
		this.installment = installment;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		sb.append("number =  " + getNumber());
		sb.append("\ndate =  " +  getDate().format(dtf));
		sb.append("\ntotalValue = " +  String.format("%.2f", getTotalValue()));
//		sb.append("Valor da parcela: " + getInstallment().getAmount());
		return sb.toString();
	}
}
