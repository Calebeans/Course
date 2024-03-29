package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return (width * height);
	}
	
	public double perimeter() {
		return (2*(width + height));
	}
	
	public double diagonal(double area, double perimeter) {
		return ((Math.sqrt(Math.pow(perimeter, 2.0) - 8 * area))/2);
	}
}
