package secao15.arquivos.model.entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String pathDiretorioRaiz = "C:\\Java Cursos";

//		// objeto do tipo File com o caminho e nome onde será criado o subdiretorio
		File subDiretory = new File(pathDiretorioRaiz + "\\out");
		if (!subDiretory.exists()) {
			boolean criaSubDiretorio = subDiretory.mkdir();
			if (criaSubDiretorio) {
				System.out.println("O diretório '" + subDiretory.getName() + "' foi criado");
			} else {
				System.out.println("Falha ao criar o diretório");
			}
		}

		File sourceFile = new File(subDiretory, "summary.csv");
		// criando o arquivo
		try {
			boolean criaArquivoSource = sourceFile.createNewFile();
			if (criaArquivoSource) {
				System.out.println("Arquivo criado");
			} else {
				System.out.println("Falha ao criar arquivo. O arquivo já existe");
			}
		} catch (IOException e) {
			System.out.println("Ocorreu um I/O exception");
			e.printStackTrace();
		}

		// implementa os objetos produtos e adiciona numa lista
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("TV LED", 1290.00, 1));
		list.add(new Product("Vídeo Game Chair", 350.50, 3));
		list.add(new Product("Samsung Galaxy 9", 850.00, 2));

		// escrevendo os dados dos itens no arquivo source.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(sourceFile.getAbsolutePath()))) {

			for (Product product : list) {
				bw.write(product.toString());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();

	}

	public static boolean criaSubDiretorio(String path, String nome) {
		File subDiretorio = new File(path, nome);
		return subDiretorio.mkdir();
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
