package secao15.arquivos.model.entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TesteManipulaArquivo {

	public static void main(String[] args) {

		// criando o subDiretorio
		File subDiretorio = criaSubDiretorio("C:\\Java Cursos", "out");
		// criando arquivo
		try {
			boolean criaArquivo = criaArquivo(subDiretorio, "list.txt");
			trataErroArquivo(criaArquivo);

		} catch (IOException e) {
			System.out.println("Ocorreu um I/O exception");
			e.printStackTrace();
		}

	}

	public static boolean trataErroArquivo(boolean criaArquivo) {
		if (criaArquivo) {
			System.out.println("Arquivo criado");
		} else {
			System.out.println("Falha ao criar arquivo. O arquivo já existe");
		}
		return criaArquivo;
	}

	public static File criaSubDiretorio(String path, String nome) {
		File subDiretorio = new File(path, nome);

		if (!subDiretorio.exists()) {
			boolean criaSubDiretorio = subDiretorio.mkdir();
			if (criaSubDiretorio) {
				System.out.println("O diretório '" + subDiretorio.getName() + "' foi criado");

			} else {
				System.out.println("Falha ao criar o diretório");
			}
		}else {
			System.out.println("O diretório '" + subDiretorio.getName() + "' já existe");
		}
		return subDiretorio;

	}

	public static boolean criaArquivo(File path, String nome) throws IOException {
		File arquivo = new File(path, nome);
		return arquivo.createNewFile();
	}

	public static BufferedWriter escreveDadosSource(List<Product> list, File file) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsolutePath()));

		for (Product product : list) {
			bw.write(product.toString());
			bw.newLine();
		}
		return bw;

	}

	public static BufferedWriter escreveDadosSummary(List<Product> list, File file) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsolutePath()));

		for (Product product : list) {
			bw.write(product.outSummary());
			bw.newLine();
		}
		return bw;

	}

}
