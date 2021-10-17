package lab.ex37;

public class MethodsDemoA {
	public static void main(String[] args) {
		
		System.out.println("Die Summe aus 1,5 + 2,5 ist: " + add(1.5, 2.5));
	}

	public static double add(double wert1, double wert2) {
		double result = wert1 + wert2;
		return result;
	}
	

}
