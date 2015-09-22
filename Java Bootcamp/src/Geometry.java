
public class Geometry {

	public void printArea(Shape shape) {
		System.out.println(shape.getClass().getName() + ": "+ shape.getArea());
	}
	
	public static void main(String[] args) {
		
		Geometry geometry = new Geometry();
		
		geometry.printArea(new Square(4));
		
		geometry.printArea(new Circle(5));
		
		geometry.printArea(new Triangle(6, 7));
		
		geometry.printArea(new Rectangle(2, 3));
	}
}
