package secao15.arquivos;

import java.io.File;
import java.util.Scanner;

public class ProgramPastas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		//File pode ser tanto um caminho de um arquivo como o caminho de uma pasta
		File path = new File(strPath);
		
		//lista as subpastas de um diretório
		//dentro da função listFiles() especifica uma função que especifica que tipo de coisas que se quer filtrar
		//listFiles(File::isDirectory) : lista somento o que for diretorios
		//essa chamada cria um vetor de files contendo cada um dos caminhos das subpastas
		File[] folders = path.listFiles(File::isDirectory);//dentro do parenteses tem uma sintaxe de reference methods
		System.out.println("FOLDERS:");
		
		for (File folder : folders) {
			System.out.println(folder);
			
		}
		//lista os arquivos dentro do diretório
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES");
		for (File file : files) {
			System.out.println(file);
		}
		
		//criando um subpasta a partir do diretorio inserido na variavel path
		
		//a função vai retornar um valor booleano informando se a ação foi concluida ou nao
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " +  success);
		
		sc.close();
	}

}
