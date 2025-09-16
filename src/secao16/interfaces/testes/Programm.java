package secao16.interfaces.testes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Programm {

	public static void main(String[] args) {

		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String retiradaStr = "25/06/2018 10:30";
		String devolucaoStr = "25/06/2018 14:40";
		
		LocalDateTime retirada = LocalDateTime.parse(retiradaStr, dtf);
		LocalDateTime devolucao = LocalDateTime.parse(devolucaoStr, dtf);
		Locadora locacao1 = new Locadora("Civic", retirada, devolucao, 10.00, 130.00);
		
//		locacao1.setRetirada(retirada);
//		System.out.println(locacao1.getRetirada().format(dtf));
	}

}
