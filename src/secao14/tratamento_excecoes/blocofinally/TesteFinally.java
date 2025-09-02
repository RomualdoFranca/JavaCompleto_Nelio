package secao14.tratamento_excecoes.blocofinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteFinally {

	public static void main(String[] args) {
		
		//Copiar caminho com barra normal
		//Clique uma vez na barra de endereços do Explorer (onde aparece o caminho).
		//Ele vai mostrar o caminho no formato com barra normal:
		//Daí é só acrescentar o nome do arquivo no final:

		File file = new File(
				"C:\\Java Cursos\\mapaSandWorm.txt");
		Scanner sc = null;
		try {
			//a classe scanner também pode apontar para arquivos.Ela pode ler a partir de arquivos e nao apenas do console
			sc = new Scanner(file);
			//percorre o arquivo linha por linha. Percorre as linhas do arquivo
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());

			}
		}
		//exceção de arquivo não encontrado
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		
		}
		//o bloco finally fecha o scanner idependente de ter aberto o arquivo ou nao
		finally {
			if(sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}
	}

}
