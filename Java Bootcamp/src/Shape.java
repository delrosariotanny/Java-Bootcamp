
public abstract class Shape {
	
	private double area;
	
	protected abstract double computeArea();
	
	public double getArea() {
		
		area = computeArea();
		
		return area;
	}
}
