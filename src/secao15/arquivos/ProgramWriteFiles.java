package secao15.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/*
 * A mensagem de erro "A sintaxe do nome do arquivo, do nome do diretório ou do rótulo do volume está incorreta" ocorre no seu código devido a um detalhe na forma como o caminho do arquivo (variável path) foi definido.

Ao obter o caminho do arquivo clicando com o botão direito, o Windows inclui aspas duplas no início e no fim do caminho para que ele seja interpretado corretamente se for usado em um prompt de comando, por exemplo. No entanto, para o Java, essas aspas duplas fazem parte da string do caminho e são consideradas caracteres inválidos para o nome do arquivo.

Veja como a sua variável path está declarada:

String path = "\"C:\\Java Cursos\\Arquivos Criados em Java\\out.txt\"";

Note que há um par de aspas duplas antes do C: e um par depois do .txt. Para o Java, o caminho do arquivo é interpretado como "C:\Java Cursos\Arquivos Criados em Java\out.txt", o que é um nome de arquivo inválido.

Como corrigir o código

Para resolver o problema, basta remover as aspas duplas da declaração da string. O caminho correto seria:

String path = "C:\\Java Cursos\\Arquivos Criados em Java\\out.txt";

Ao fazer essa mudança, o código funcionará como esperado, criando o arquivo out.txt e escrevendo as linhas do array lines nele.
 * */

public class ProgramWriteFiles {

	public static void main(String[] args) {

		String[] lines = new String[] {"Abacate", "Banana", "Côco", "Damasco", "Figo"};
		String path = "C:\\Java Cursos\\Arquivos Criados em Java\\out.txt";
//		String path2 = "C:\\Java Cursos\\Arquivos Criados em Java\\teste.txt";
		
		//se acrescentar a palavra 'true' no argumento de FileWrite(), e se o arquivo já existir, os dados serão
		//acrescentados no arquivo. Sem o 'true', um novo arquivo é criado ou se o arquivo ja existir, é substituido
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line : lines) {
				bw.write(line);//esse método não pula linha após a escrita
				bw.newLine();//metodo para pular linha
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
