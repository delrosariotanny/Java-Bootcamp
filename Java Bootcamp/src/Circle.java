
public class Circle extends Shape {
	double PIE = 3.14;
	double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double computeArea() {
		double area = PIE * radius * radius;
		return area;
	}

}
