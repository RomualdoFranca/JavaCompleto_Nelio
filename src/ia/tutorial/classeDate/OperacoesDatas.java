package ia.tutorial.classeDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacoesDatas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// definindo as datas
//		LocalDate dataInicial = LocalDate.of(2025, 9, 10);
//		LocalDate dataFinal = LocalDate.of(2025, 9, 20);
//		
		// define a formatação de entrada e saída da data
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		List<LocalDate> datas = insereDatas(sc);
		
		// imprime as datas inseridas
		System.out.println("Primeira entrada de data");
		for (LocalDate localDate : datas) {
			System.out.println(localDate.format(dtf));
		}
		
		alteraDatas(sc, dtf, datas);
		
		System.out.println("Segunda entrada de data");
		for (LocalDate localDate : datas) {
			System.out.println(localDate.format(dtf));
		}

//		// acessa as data pelo indice da lista
//		System.out.println("Primeira data inserida: " + datas.get(0).format(dtf));

		// loop para inserir datas nas seguintes regras:
		// data de saida maior que data de entrada
		// alteração da data so pode ocorrer para datas futuras em relação a data
		// inserida inicialmente

		// diferença entre as datas.
//		long periodoDias = ChronoUnit.DAYS.between(entrada, saida);
//		System.out.println("Diferença entre os dias com data inseridas pelo usuário: " + periodoDias);
		
		// calculando a diferença de dias
//		long diferencaEmDias = ChronoUnit.DAYS.between(dataInicial, dataFinal);
//		System.out.println(diferencaEmDias);

		sc.close();

	}// fim do main

	//metodo para imprimir as datas inseridas
	public static void imprimeDatas(List<LocalDate> datas, DateTimeFormatter dtf) {
		for (LocalDate localDate : datas) {
			System.out.println(localDate.format(dtf));
		}
	}
	
	public static List<LocalDate> insereDatas(Scanner sc) {
		System.out.print("Insira data 01: ");
		String inputData01 = sc.nextLine();
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

	// *******************************************************
	public static List<LocalDate> alteraDatas(Scanner sc, DateTimeFormatter dtf, List<LocalDate> datas) {
		System.out.println("Nova data de entrada:");

		for (int i = 0; i < datas.size(); i++) {
			
			System.out.print("Data " + (i + 1) + ": ");
			LocalDate novaData = LocalDate.parse(sc.nextLine(), dtf);
			boolean ehDepois = novaData.isAfter(datas.get(i));
			
			if (ehDepois == true){
				System.out.println("A alteração PODE ser realizada.");
				//realiza a alteração da data que foram inseridas na lista
				datas.set(i, novaData);
			} else {
				System.out.println("A alteração NÃO pode ser realizada.");

			}
		}
		return datas;

	}// fim do metodo alteraDatas

}// fim da classe
