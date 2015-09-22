
public class Square extends Shape {
	double side;
	
	public Square() {
		
	}
	
	public Square(int side) {
		this.side = side;
	}

	@Override
	public double computeArea() {
		double area = side * side;
		return area;
	}

}
