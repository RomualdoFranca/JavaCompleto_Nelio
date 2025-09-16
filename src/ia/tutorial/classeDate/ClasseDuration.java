package ia.tutorial.classeDate;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClasseDuration {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Métodos da classe Duration");
		
		String inicioStr = "25/06/2018 10:30";
		String fimStr = "26/06/2018 12:30";
		
		LocalDateTime inicio = LocalDateTime.parse(inicioStr, dtf);
		LocalDateTime fim= LocalDateTime.parse(fimStr, dtf);
		
		Duration duracao = Duration.between(inicio, fim);
		boolean temMinutosFracionados = (duracao.toMinutes() % 60) != 0; 
		
		if(temMinutosFracionados) {
			System.out.println(duracao.toHours() + "h:" + duracao.toMinutes() % 60 + "m");
		}else {
			
			System.out.println(duracao.toHours()+ "h");
		}
		
		//código refatorado pela IA
		long horas = duracao.toHours();
        long minutos = duracao.toMinutes() % 60;
        System.out.println(horas + "h:" + minutos + "m");
		
		
//		LocalDateTime retirada1 = LocalDateTime.of
//		LocalDateTime
		
	}

}
