package ia.tutorial.classeDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacoesDatas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Testando método ");
		List<LocalDate> datas = insereDatas(sc);
		
		//imprime as datas inseridas
		for (LocalDate localDate : datas) {
			System.out.println(localDate.format(dtf));
		}
		
		System.out.print("Insira a data de entrada (dd/mm/yyyy):");
		String dataInputEntrada = sc.nextLine();

		System.out.print("Insira a data de saída (dd/mm/yyyy):");
		String dataInputSaida = sc.nextLine();

		// define o padrão de formatação de entrada
		// o .parse() recebe o tipo string com a formação definida e converte num tipo
		// LocalDate
		LocalDate entrada = LocalDate.parse(dataInputEntrada, dtf);
		LocalDate saida = LocalDate.parse(dataInputSaida, dtf);
		
		System.out.println("Data de entrada: " + entrada.format(dtf));
		System.out.println("Data de saída: " + saida.format(dtf));

		System.out.print("Altera a data de entrada:");
		String entradaAlterada = sc.nextLine();
		
		System.out.print("Altera a data de saída:");
		String saidaAlterada = sc.nextLine();
		
		LocalDate alteraEntrada = LocalDate.parse(saidaAlterada, dtf);
		LocalDate alteraSaida = LocalDate.parse(saidaAlterada, dtf);
		
//		if (alteraEntrada.isAfter(entrada) && ) {
//			
//		}
		
		
		//loop para inserir datas nas seguintes regras:
		//data de saida maior que data de entrada
		//alteração da data so pode ocorrer para datas futuras em relação a data inserida inicialmente
		

		// diferença entre as datas.
		long periodoDias = ChronoUnit.DAYS.between(entrada, saida);
		System.out.println("Diferença entre os dias com data inseridas pelo usuário: " + periodoDias);

		// definindo as datas
		LocalDate dataInicial = LocalDate.of(2025, 9, 10);
		LocalDate dataFinal = LocalDate.of(2025, 9, 20);

		// calculando a diferença de dias
		long diferencaEmDias = ChronoUnit.DAYS.between(dataInicial, dataFinal);
		System.out.println(diferencaEmDias);

		sc.close();

	}
	
	public static List<LocalDate> insereDatas(Scanner sc) {
		System.out.print("Insira data 01: ");
		String inputData01 =  sc.nextLine();
		System.out.print("Insira data 02: ");
		String inputData02 = sc.nextLine();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data01 = LocalDate.parse(inputData01, dtf);
		LocalDate data02 = LocalDate.parse(inputData02, dtf);
		
		List<LocalDate> datas = new ArrayList<LocalDate>();
		datas.add(data01);
		datas.add(data02);
		return datas;
		
		
		
		
	}

}
