package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapeList = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			sc.nextLine();
			System.out.println("Shape #" +i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char whatShapeIs = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(whatShapeIs == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				Rectangle rectangle = new Rectangle(color, width, height);
				shapeList.add(rectangle);
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				Circle circle = new Circle(color, radius);
				shapeList.add(circle);
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape shape : shapeList) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}

}
