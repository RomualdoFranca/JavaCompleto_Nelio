package secao13.polimorfismo.myideias.application;

import java.util.ArrayList;
import java.util.Scanner;

import secao13.polimorfismo.entities.Employee;
import secao13.polimorfismo.entities.OutsourcedEmployee;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		System.out.print("Enter the number of employees: ");
		int numberEmployees = sc.nextInt();
		sc.nextLine();//consome quebra de linha
		
		//loop para inserir os dados dos empregados
		for (int i = 1; i <= numberEmployees; i++) {
			
			System.out.println("Employee #" + i + " data:");
			String outsourced = null;
			
			String typeEmployee  = typeEmployee(outsourced, sc);
			
			//insere dados do empregado do tipo outsourced
			if(typeEmployee.equals("y")) {
				System.out.print("Name: ");
				String name = sc.nextLine();
				
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				sc.nextLine();
				//cria um objeto e adiciona na lista
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				
			//insere dados do empregado do tipo comum
			}else {
				System.out.print("Name: ");
				String name = sc.nextLine();
				
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				sc.nextLine();
				employees.add(new Employee(name, hours, valuePerHour));//cria um objeto e adiciona na lista
			}//fim do if-else
			
		}//fim do loop
//		System.out.println("PAYMENTS");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		
		sc.close();
		
	}
	
	//metodo que define o tipo de empregado
	public static String typeEmployee(String type, Scanner sc) {
		do {
			System.out.println("Outsourced? (y/n)?");
		    type = sc.nextLine();
		    if(!type.equals("y") && !type.equals("n"))
		    	System.out.println("Entrada inválida");
		    
		} while (!type.equals("y") && !type.equals("n"));
		return type;
		
	}
	
}
