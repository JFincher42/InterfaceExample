package interfaceExample;

// Lab part 2A: Make the Rectangle class below implement the Shape interface,
// and add a constructor that takes two parameters of type double, named length and width.
// See the Circle class for an example of how to implement the Shape interface.

public class Rectangle implements Shape {
	// field declarations go here
	private double length;
	private double width;
	// constructor goes here
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	// methods of the Shape interface go here
	
	public double area() {
		return this.length * this.width;
	}
	
	public double perimeter() {
		return 2 * (this.length + this.width);
	}
}
