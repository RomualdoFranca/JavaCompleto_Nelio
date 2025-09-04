package secao14.tratamento_excecoes.personalizadas.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import secao14.tratamento_excecoes.personalizadas.model.exception.DomainException;

/*
 * Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data
de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em
dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
novamente a reserva com os dados atualizados. O programa não deve aceitar dados
inválidos para a reserva, conforme as seguintes regras:
- Alterações de reserva só podem ocorrer para datas futuras
- A data de saída deve ser maior que a data de entrada*/

public class Reservation {
	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;

	public Reservation() {

	}

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws DomainException{

		if(!checkout.isAfter(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckin() {
		return checkin;
	}


	public LocalDate getCheckout() {
		return checkout;
	}


	public long duration() {
		long duration = ChronoUnit.DAYS.between(checkin, checkout);
		return duration;
	}

	public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException{
		
		LocalDate now = LocalDate.now();
		if(checkin.isBefore(now) || checkout.isBefore(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if(!checkout.isAfter(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkin = checkin;
		this.checkout = checkout;

	}
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		sb.append("Reserva: Quarto " + getRoomNumber() + ",");
		sb.append(" check-in: " + getCheckin().format(dtf) + ",");
		sb.append(" check-out: " + getCheckout().format(dtf) + ",");
		sb.append(duration() + " nights");
		return sb.toString();
	}

}
