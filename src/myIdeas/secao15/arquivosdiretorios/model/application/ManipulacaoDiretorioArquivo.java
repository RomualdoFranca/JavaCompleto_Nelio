package myIdeas.secao15.arquivosdiretorios.model.application;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class ManipulacaoDiretorioArquivo {
	// Opções:
	// 1 - Criar diretório principal
	// Informar em qual diretorio

	// 2 - Criar subdiretorio
	// 3 - Criar arquivo
	// 4 - Adicionar dados no arquivo
	// 5 - Recriar arquivos com novos dados
	// 6 - Apagar arquivo
	// 7 - Apagar diretorio
	// 8 - Listar diretorios (caminhos e nomes)
	// 9 - Listar arquivos
	// 8 - Finalizar operação
	// path = C:\\Java Cursos\\ManipulacaoDiretorioArquivos

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// local onde as subpastas serao criadas
		String pathPadrao = "C:\\Java Cursos\\ManipulacaoDiretorioArquivos";

		criaDiretorio(pathPadrao,sc);
		File[] folders = listaDiretorio(pathPadrao);
		System.out.println("Valor retornado pelo metodo extraiNumero():");
		for (File file : folders) {
			System.out.println(extraiNumero(folders));;
		}
		imprimeListaCaminhos(folders, pathPadrao);

		sc.close();

	}

	// ********************************************************************
	public static boolean comparaCaracteres(String nome, File[] files) {
		// caracteres de referencia para serem comparados
		char[] caracteresEspeciais = new char[] { '?', '<', '>', '|', '\"', '\\', '/', ':' };
		externo: // rotulo para loop externo
		// loop externo que percorre todos os caracteres do nome inserido
		for (int i = 0; i < nome.length(); i++) {

			// loop interno que percorre o array com os caracteres de referencia
			for (int j = 0; j < caracteresEspeciais.length; j++) {
				if (nome.trim().charAt(i) == caracteresEspeciais[j]) {
					return true;
				}
			}
		}
		return false;

	}

	// *****************************************************************
	public static boolean comparaNomes(File[] files, String nome) {

		for (int i = 0; i < files.length; i++) {
			if (nome.trim() == files[i].getName()) {
				return true;
			}
		}
		return false;

	}
	// ********************************************************************


	public static int extraiNumero(File[] files) {
		StringBuilder sb = new StringBuilder();
		int valor = 0;
		for (int i = 0; i < files.length; i++) {
			for (int j = 0; j < files[i].getName().length(); j++) {
				char c = files[i].getName().charAt(i);
				if(Character.isDigit(c)) {
					sb.append(c);
					
					return valor;
				}
			}
			
			valor = Integer.parseInt(sb.toString());
		}
		return valor;
	}

	public static int converteLiteralNumerico(String nome) {
		// seleciona o caractere literal numerico do nome do diretorio ou arquivo criado
		char caractereNumerico = nome.charAt(nome.length() - 1);
		// converte o caractere em inteiro
		int num = Character.getNumericValue(caractereNumerico);
		// realiza a soma. A operação de soma deve esta entre parenteses, pois caso não
		// esteja,
		// haverá concatenação e nao soma
//		System.out.println("Somando o numeral: " + (num + 1));
		return num;
	}

	// metodos de criacao
	public static void criaDiretorio(String pathPadrao, Scanner sc ) {

		File[] folders = listaDiretorio(pathPadrao);
		System.out.println("Criando pasta:\nDigite o nome da pasta");
		String nomePasta = sc.nextLine();
		// chamada de metodo que verifica se o nome inserido contem algum dos caracteres
		// especiais

		if (comparaCaracteres(nomePasta, folders) == true) {
			System.out.println("O nome inserido não pode ter os seguintes caractéres:\n\\/:*?\"<>");
			for (int i = 0; i < folders.length; i++) {
				if(folders[i].getName().equals("Nova pasta") && extraiNumero(folders) != 0) {
					nomePasta = "Nova Pasta(" + (extraiNumero(folders) + 1) + ")";
					
				}else {
					// substitui o nome inserido por um nome padrao valido
					nomePasta = "Nova Pasta";
					
				}
			}

		}
		boolean success = new File(pathPadrao + "\\" + nomePasta).mkdir();
		// quando tiver caracteres especiais, para que o nome padrao seja inserido é
		// necessario verificar
		// se ja existe na lista de diretorios algum com o nome de "Nova pasta"
		// Se houver, verificar se há numero no final
		// Se houver número, selecionar, converter em inteiro e somar uma unidade

		// a barra dublicada é acrescentada no caminho padrão. Após as barras, o nome da
		// pasta é adicionado
		// Sem as barras, O nome da pasta seria concatenado com o nome do diretorio
		// padrao, criando um diretorio
		// fora dele com o outro nome
	}

	// lista os diretorios
	public static File[] listaDiretorio(String pathPadrao) {
		File path = new File(pathPadrao);

		// vetor que armazena a lista de caminhos dos diretorios
		File[] folders = path.listFiles(File::isDirectory);
		return folders;

	}

	public static void imprimeListaCaminhos(File[] files, String pathPadrao) {

		// imprime a lista
		System.out.println("Lista de subdiretórios de : " + pathPadrao);
		for (File file : files) {
			System.out.println(file);
		}
	}

}
