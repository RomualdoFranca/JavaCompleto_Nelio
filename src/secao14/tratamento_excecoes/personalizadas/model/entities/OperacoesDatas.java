package secao14.tratamento_excecoes.personalizadas.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class OperacoesDatas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a data de entrada:");
		String dataInputEntrada = sc.nextLine();
		
		System.out.print("Insira a data de saída:");
		String dataInputSaida = sc.nextLine();
		
		//define o padrão de formatação de entrada
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//o .parse() recebe o tipo string com a formação definida e converte num tipo LocalDate
		LocalDate entrada = LocalDate.parse(dataInputEntrada, dtf);
		LocalDate saida = LocalDate.parse(dataInputSaida, dtf);
		
		//diferença entre as datas. 
		long periodoDias = ChronoUnit.DAYS.between(entrada, saida);
		System.out.println("Diferença entre os dias com data inseridas pelo usuário: " + periodoDias);
		
		//definindo as datas
		LocalDate dataInicial = LocalDate.of(2025, 9, 10);
		LocalDate dataFinal = LocalDate.of(2025, 9, 20);
		
		//calculando a diferença de dias
		long diferencaEmDias = ChronoUnit.DAYS.between(dataInicial, dataFinal);
		System.out.println(diferencaEmDias);
		
		sc.close();
		
		
				
	}

}
