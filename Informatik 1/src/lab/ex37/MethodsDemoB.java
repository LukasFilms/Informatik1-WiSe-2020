package lab.ex37;

public class MethodsDemoB {
	public static void main(String[] args) {
		System.out.println("größere aus 500 und 600: " + max(500,600));
	}
	
	public static int max(int wert1, int wert2) {
		
		if (wert1 > wert2) {
			return wert1;
		} else {
			return wert2;
		}
	}

}
