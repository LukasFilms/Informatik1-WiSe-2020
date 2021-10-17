package lab.ex37;

public class MethodsDemoC {
	public static void main(String[] args) {
		System.out.println("größere aus 3 int werten ( 10, 20, 30): " + max(10, 20, 30));
	}
	
	public static int max(int wert1, int wert2, int wert3) {
		if ((wert1 > wert2) || (wert1 > wert3)){
		return wert1; 
		} else if ((wert2 > wert1) || (wert2 > wert3)) {
			return wert2;
		} else {
			return 31;
		}
	}

}
