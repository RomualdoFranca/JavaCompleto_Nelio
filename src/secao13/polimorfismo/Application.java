package secao13.polimorfismo;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import secao13.polimorfismo.entities.Employee;
import secao13.polimorfismo.entities.OutsourcedEmployee;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();//consome quebra de linha
		
		ArrayList<Employee> list = new ArrayList<>();
		
		
		//loop para inserir os dados dos empregados
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Employee #" + i + " data:");
			System.out.println("Outsourced? (y/n)?");
		    char ch = sc.next().charAt(0);
		    sc.nextLine();
			
		    System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			sc.nextLine();
			
			
			//insere dados do empregado do tipo outsourced
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				sc.nextLine();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				
			}else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
				
		}		
		System.out.println();
		System.out.println("PAYMENTS");
		
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
		
	}
	
	
}
