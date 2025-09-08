package myIdeas.secao15.arquivosdiretorios.model.application;

import java.io.File;
import java.util.Scanner;

public class ManipulacaoDiretorioArquivo {
	//Opções:
			//1 - Criar diretório principal
			//Informar em qual diretorio 
			
			//2 - Criar subdiretorio
			//3 - Criar arquivo
			//4 - Adicionar dados no arquivo
			//5 - Recriar arquivos com novos dados
			//6 - Apagar arquivo
			//7 - Apagar diretorio
			//8 - Listar diretorios (caminhos e nomes)
			//9 - Listar arquivos
			//8 - Finalizar operação
			//path = C:\\Java Cursos\\ManipulacaoDiretorioArquivos

	public static void main(String[] args) {

		System.out.println("Lista de endereços de diretórios");
		listaDiretorio();
		
		
		
	}
	
	//metodos de criacao
	public static void criaDiretorio(Scanner sc) {
		String pathPadrao = "C:\\Java Cursos\\ManipulacaoDiretorioArquivos";
		
		File file = new File(pathPadrao);
	}
	
	//lista os diretorios
	public static void listaDiretorio() {
//		String pathPadrao = "C:\\Java Cursos\\ManipulacaoDiretorioArquivos";
		String pathPadrao = "C:\\Java Cursos";
		File path = new File(pathPadrao);
		
		//vetor que armazena a lista de caminhos dos diretorios
		File[] files = path.listFiles(File::isDirectory);
		
		//imprime a lista
		System.out.println("Lista de diretório dentro do diretório: " + pathPadrao);
		for (File file : files) {
			System.out.println(file);
		}
		
	}
	
	
	
	

}
