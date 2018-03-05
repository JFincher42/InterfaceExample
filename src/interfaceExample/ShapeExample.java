package interfaceExample;

public class ShapeExample {
	
	public static double getTotalArea(Shape[] shapes) {
		double total = 0.0;
		for (Shape shape : shapes)
			total += shape.area();
		return total;
	}
	
	// Lab part 1A: add a new method getTotalPerimeter

	public static void main(String[] args) {
		Shape[] shapes = new Shape[] {
				new Circle(1.0),
				new Circle(2.0)
				// Lab part 2B: add another element: a new Rectangle with length 2.0 and width 3.0
				// Don't forget to add a comma after the previous element.
		};
		double totalArea = getTotalArea(shapes);
		System.out.println("Total area of all shapes is " + totalArea);
		// Lab part 1B: calculate and print total perimeter 
	}

}
