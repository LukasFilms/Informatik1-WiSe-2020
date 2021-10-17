package lab.ex38;

public class circle {
	public static void main(String[] args) {
		for (int radius = 1; radius <= 20; radius++) {
			System.out.printf(" Radius: %d\n", radius);
			System.out.printf(" Durchmesser: %10.2f cm\n", diameter(radius));
			System.out.printf(" Umfang     : %10.2f cm\n", umfang(radius));
			
		}
	}
	
	public static int diameter(int radius) {
		return radius + radius;
	}
	
	public static double umfang(int radius) {
		return 2 * Math.PI * radius;
	}

}
