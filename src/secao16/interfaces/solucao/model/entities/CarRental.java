package secao16.interfaces.solucao.model.entities;

import java.time.LocalDateTime;

//aluguel de carros
public class CarRental {

	private LocalDateTime start;
	private LocalDateTime finish;

	// associações
	private Vehicle vehicle;
	private Invoice invoice;

	public CarRental() {

	}

	//o construtor não inicia com a fatura (Invoice) pois ela so vai existir após o aluguel do veículo
	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
