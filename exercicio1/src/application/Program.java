package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		double area, perimeter, diagonal;
		
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		area = rectangle.area();
		perimeter = rectangle.perimeter();
		diagonal = rectangle.diagonal(area, perimeter);
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Perimeter = %.2f%n", perimeter);
		System.out.printf("Diagonal = %.2f%n", diagonal);
		
		sc.close();
	}

}
