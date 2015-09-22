
public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double computeArea() {
		double area = width * length;
		return area;
	}

}
