package myIdeas.teste;

public class Program {

	public static void main(String[] args) {
		//Este destino já contém uma pasta chamada "nome da pasta"

		String str = "Nova pasta(2)";
		String str2 = "Nova pasta(2)";
		
		if(String.valueOf(str).equals(str2)) {
			System.out.println("Este destino já contém uma pasta chamada " + "\"" + str2 + "\"");
			//retira o primeiro li
			char numLiteral = str2.charAt(str2.length() - 2);
			//transformar um dígito em número usando ASCII
			int numASCII = numLiteral - '0';
			
			
			
//			int num = Character.getNumericValue(numLiteral);
			str2 = "Nova pasta(" + (numASCII + 1) + ")";
		}else {
			System.out.println("Nomes diferentes");
		}
		System.out.println("str2: " + str2);
		
		String[] literalNumericos = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
//		for(int i = 0; i < str.length(); i++) {
//			
//			for(int j = 0; j < 10; j++) {
//				//percorre a string do 1° caractere ao ultimo
//				char ch = str.charAt(i);
//				//compara o caractere selecionado da string com os elementos da array de literais numericos
//				if(String.valueOf(ch).equals(literalNumericos[j])) {
//					System.out.println("igual");
//				}else {
//					System.out.println("diferente");
//				}
//				
//				//converte o caractere em inteiro
////				int charInt = Character.getNumericValue(ch);
//			}
//		}
		
		
	}

}
