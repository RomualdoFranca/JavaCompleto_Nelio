package secao15.arquivos.model.entities;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o caminho do diretório:");
		//caminho do diretorio raiz onde sera criado a pasta para os arquivos .csv 
		String pathDiretorioRaiz = sc.nextLine();//"C:\\Java Cursos";
		
		//variavel que indica se a criação da subpasta ocorreu com sucesso
		System.out.print("Digite o nome da subpasta");
		boolean success = new File(pathDiretorioRaiz + "\\Arquivos_csv").mkdir();//função que cria o diretorio
		System.out.println("\nA subpasta foi criada: " + success);
		
		//caminho do subdiretorio onde serao armazenados o arquivo .csv contendo todos os dados dos intens
		String pathSubDiretorio = "C:\\Java Cursos\\Arquivos_csv";
		
		
		sc.close();
		
		
		
		
		
		Product item1 = new Product("TV LED", 1290.00, 1);
		System.out.println(item1);
	}

}
