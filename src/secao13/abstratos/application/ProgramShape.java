package secao13.abstratos.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao13.abstratos.entities.Circle;
import secao13.abstratos.entities.Rectangle;
import secao13.abstratos.entities.Shape;
import secao13.abstratos.enums.Color;

public class ProgramShape {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Enter the numbers of shapes: ");
		int numberShapes = sc.nextInt();
		sc.nextLine();
		
		List<Shape> shapeList = new ArrayList<Shape>();
		
		for (int i = 1; i <= numberShapes; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c) ?");
			char shapeType = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Color:\nBLACK\nBLUE\nRED");
			Color color = Color.valueOf(sc.next());
//			Color color = Color.valueOf(sc.nextInt());
			sc.nextLine();
			
			
			if(shapeType == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				sc.nextLine();
				
				shapeList.add(new Rectangle(color, width, height));
				
			}else {
				
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				sc.nextLine();
				
				shapeList.add(new Circle(radius, color));
			}
		}//fim do loop
		
		for (Shape shape : shapeList) {
			System.out.println(shape);
		}
		
		
	}

}
