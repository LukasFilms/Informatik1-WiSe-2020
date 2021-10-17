package lab.ex60;

public class StringMethoden {
	
	public static void main (String[] args) {
		printValue(55, "km");
		System.out.println(repeatString("hu"));
		System.out.println(repeatString("*",4));
		System.out.println(formatAdress("Stuttgart", "Nobelstr.", 10, 70569));
		
	}
	
	// gibt den �bergebenen Wert (als Zahl) und Einheit (als Text) auf der Konsole aus.
	static void printValue(int value, String unit) {
		System.out.println(value + " " + unit);
	}
	
	// h�ngt die �bergebene Zeichenkette zweimal aneinander und liefert das Ergebnis zur�ck
	static String repeatString(String text) {
		return text + text;
	}
	
	// h�ngt die �bergebene Zeichenkette count Mal aneinander und liefert das Ergebnis zur�ck.
	static String repeatString(String text, int count) {
		String output = "";
		for (int i = 0; i < count; i++) {
			output += text;
		}
		return output;
	}
	
	// liefert die Teile einer Anschrift in einer einzigen Zeichenkette zusammenfasst zur�ck.
	static String formatAdress(String city, String street, int nr, int zip) {
		String output = (street + " " + nr + " " + zip + " " + city);
		return output;
	}
	

}
