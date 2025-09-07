package secao15.arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFiles {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\rommu\\OneDrive\\Documentos\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNext()) {
//				String string = (String) sc.next();
				System.out.println(sc.nextLine());
				
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		
		}finally {
			if(sc !=null) {
				sc.close();
				
			}
		}
		
		
	}

}
