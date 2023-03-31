package application;

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter the rectangle width: ");
		rectangle.width = sc.nextDouble();
		
		System.out.print("Enter the rectangle height: ");
		rectangle.height = sc.nextDouble();
		
		Double area = rectangle.area();
		Double perimeter = rectangle.perimeter();
		Double diagonal = rectangle.diagonal();
		
		System.out.println(area);
		System.out.println(perimeter);
		System.out.printf("%.2f", diagonal);
		
		sc.close();
	}
}
