package lab.ex60;

public class StringMethoden {
	
	public static void main (String[] args) {
		printValue(55, "km");
		System.out.println(repeatString("hu"));
		System.out.println(repeatString("*",4));
		System.out.println(formatAdress("Stuttgart", "Nobelstr.", 10, 70569));
		
	}
	
	// gibt den übergebenen Wert (als Zahl) und Einheit (als Text) auf der Konsole aus.
	static void printValue(int value, String unit) {
		System.out.println(value + " " + unit);
	}
	
	// hängt die übergebene Zeichenkette zweimal aneinander und liefert das Ergebnis zurück
	static String repeatString(String text) {
		return text + text;
	}
	
	// hängt die übergebene Zeichenkette count Mal aneinander und liefert das Ergebnis zurück.
	static String repeatString(String text, int count) {
		String output = "";
		for (int i = 0; i < count; i++) {
			output += text;
		}
		return output;
	}
	
	// liefert die Teile einer Anschrift in einer einzigen Zeichenkette zusammenfasst zurück.
	static String formatAdress(String city, String street, int nr, int zip) {
		String output = (street + " " + nr + " " + zip + " " + city);
		return output;
	}
	

}
