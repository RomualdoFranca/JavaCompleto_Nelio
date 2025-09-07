package secao14.excecoes.exercicio.model.application;

import java.util.Locale;
import java.util.Scanner;

import secao14.excecoes.exercicio.model.entities.Account;
import secao14.excecoes.exercicio.model.exception.DomainAccountException;

public class ProgramAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); 
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter account data:"); 
		
		try {
			System.out.print("Number: ");
			int numAccount = Integer.parseInt(sc.nextLine());
			
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial balance:");
			double inicialBalance = Double.parseDouble(sc.nextLine());
			
			System.out.print("Withdraw limit:");
			double withdrawLimit = Double.parseDouble(sc.nextLine());
			
			//instancia um objeto do tipo Account
			Account acc1 = new Account(numAccount, holder, inicialBalance, withdrawLimit);
			System.out.println(acc1);
			
			System.out.print("Enter amount for withdraw:");
			double withdraw = Double.parseDouble(sc.nextLine());
			acc1.withdraw(withdraw);
			System.out.println("New balance:" + String.format("%.2f", acc1.getBalance()));
		
		}
		catch (DomainAccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (IllegalArgumentException e) {
			System.out.println("Invalid input");
		}
		catch (Exception e) {
			System.out.println("Unexpected error");
		
		}
		
		sc.close();
	}

}
