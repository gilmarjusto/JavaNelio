package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (2 * width) + (2 * height);
	}
	
	public double diagonal() {
		double h2 = Math.pow(width, 2) + Math.pow(height, 2); 
		return Math.sqrt(h2);
	}
}
