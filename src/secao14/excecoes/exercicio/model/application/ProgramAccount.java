package secao14.excecoes.exercicio.model.application;

import java.util.Locale;

import secao14.excecoes.exercicio.model.entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); 
		
		//instancia um objeto do tipo Account
		Account acc1 = new Account(8021, "Bob Brown", 500.00, 300.00);
		System.out.println(acc1);
		System.out.println();
		acc1.deposit(300.00);
		System.out.println(acc1);
	}

}
