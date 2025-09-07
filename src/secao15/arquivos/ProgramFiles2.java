package secao15.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFiles2 {

	public static void main(String[] args) {

		//o caminho do arquivo
		String path = "C:\\Users\\rommu\\OneDrive\\Documentos\\ina.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		//o bloco try é necessário porque tanto o FileReader quanto o BufferReader podem gerar exceções do IOException
		//e esse tipo de exceção deve ser tratada
		try {
			//estabelecendo uma sequencia de leitura (stream) a partir do caminho definido na variavel path
			fr = new FileReader(path);
			// BufferedReader deixa a leitura mais rapida, é uma abstração maior deixando mais flexivel o sistema de 
			//leitura de arquivos
			br = new BufferedReader(fr);
			//lendo uma linha do arquivo. Se o arquivo estiver no final, esse readLine vai retornar nulo
			String line = br.readLine();
			
			while (line != null) {//enquanto for diferente de nulo, leia outra linha novamente
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		
		}
		//no bloco finally tem algumas particularidades:
		//ao tentar fechar as stream, elas podem gerar exceções, por isso é necessário abrir um bloco try-catch
		finally {
			//fechamento manual
			try {
				if(fr != null) {
					fr.close();
				}
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();;
			}
			
		}
	}

}
