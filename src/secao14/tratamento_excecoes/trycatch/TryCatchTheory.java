package secao14.tratamento_excecoes.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTheory {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// um vetor de string que vai receber um nextLine().split(" ") baseado num
		// espaço em branco
		// ler varios dados na mesma linha separado por espaço em branco e cada um
		// desses dados vai ser um elemento do vetor
//		String[] vect =  sc.nextLine().split(" ");
//		//leitura de uma variavel position
//		int position = Integer.parseInt(sc.nextLine());
//		//mostra na tela o vetor na posição informada
//		System.out.println(vect[position]);

		// testes para gerar exceções: inserir um tipo diferente na variavel (position)
		// tentar acessar um valor maior que o tamanho do vetor.
		// por exemplo:ao inserir 3 nomes no vetor, ele tera 2 como numero maximo da
		// variavel position

		// exemplo sem os comentarios para facilitar a leitura do codigo


		method1(sc);
		System.out.println("End of program");

		sc.close();
	}
	public static void method1(Scanner sc) {
		System.out.println("*********METHOD1 START**************");
		method2(sc);
		System.out.println("*********METHOD1 END**************");
		
	}
	
	public static void method2(Scanner sc) {
		System.out.println("*********METHOD2 START**************");
		try {
			String[] vect1 = sc.nextLine().split(" ");
			int position1 = Integer.parseInt(sc.nextLine());
			System.out.println(vect1[position1]);
			// caso uma posição que não exista for inserida, a mensagem do bloco catch sera
			// impressa
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			
		} catch (NumberFormatException e) {
			System.out.println("Input error!");
		}
		System.out.println("*********METHOD2 END**************");
	}

}
