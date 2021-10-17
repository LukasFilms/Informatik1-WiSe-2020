package lab.ex77;

public class Triangle implements Shape{
	
	double height;
	double width;

	public Triangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		return height * width / 2;
	}

	@Override
	public double getPerimeter() {
		
		double hypo = height*2 + width*2; 
		
		 return height + width + Math.sqrt(hypo);
	}
	
}
