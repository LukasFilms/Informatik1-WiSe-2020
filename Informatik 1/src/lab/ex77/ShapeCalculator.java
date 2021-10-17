package lab.ex77;

public class ShapeCalculator {
	
	Shape[] shapes;
	 public static void main(String[] args) {
	 ShapeCalculator shapeCalculator = new ShapeCalculator();
	 System.out.println("Total area: " + shapeCalculator.getTotalArea());
	 System.out.println("Total perimeter: " + shapeCalculator.getTotalPerimeter());
	 }
	 public ShapeCalculator() {
	 shapes = new Shape[9];
	 shapes[0] = new Square(1.5);
	 shapes[1] = new Square(2.0);
	 shapes[2] = new Square(0.5);
	 shapes[3] = new Triangle(6.0, 4.0);
	 shapes[4] = new Triangle(7.0, 5.0);
	 shapes[5] = new Triangle(8.0, 6.0);
	 shapes[6] = new Circle(5.0);
	 shapes[7] = new Circle(3.0);
	 shapes[8] = new Circle(2.0);
	 }
	 private double getTotalArea() {
	 double totalArea = 0;
	 for (int i = 0; i < shapes.length; i++) {
	 totalArea += shapes[i].getArea();
	 }
	 return totalArea;
	 }
	 private double getTotalPerimeter() {
	 double totalPerimeter = 0;
	 for (int i = 0; i < shapes.length; i++) {
	 totalPerimeter += shapes[i].getPerimeter();
	 }
	 return totalPerimeter;
	 }
	 

}
