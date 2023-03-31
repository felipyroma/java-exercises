package application;

public class Rectangle {
	Double width;
	Double height;
	
	public Double area() {
		return width * height;
	}
	
	public Double perimeter() {
		return 2 * (width + height);
	}
	
	public Double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
}
