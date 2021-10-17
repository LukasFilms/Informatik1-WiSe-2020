package lab.ex37;

public class MethodsDemo {
	public static void main(String[] args) {
		
		System.out.println("Aufruf flipSign(10): Erwarteter Wert ist: -10, "
				 + "tatsächlicher Wert ist: " + flipSign(10));
	}
	
	/**
	* Wechselt das Vorzeichen einer Zahl, z.B. 1 -> -1, -1 -> 1.
	*
	* @param value Zahl, deren Vorzeichen gewechselt werden soll.
	* @return Zahl mit gewechseltem Vorzeichen.
	*/
	static long flipSign(long value) {
	 return -value;
	}

}
