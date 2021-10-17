package lab.ex15;
import hdm.shared.Toolbox;

public class Mean {
	public static void main(String[] args) {
		
		// Konsolen-eingabe lesen
		double FirstNumber = Toolbox.readDouble("Bitte Ersten Wert eingeben :");
		double SeccondNumber = Toolbox.readDouble("Bitte Zweiten Wert eingeben :");
		double ThirtNumber = Toolbox.readDouble("Bitte Dritten Wert eingeben :");
		
		// Durchschnitt ausrechnen
		double average = (FirstNumber + SeccondNumber + ThirtNumber) / 3;
		
		// Ergebnis ausgeben
		System.out.println("Der Durchschnitt beträgt : " + average + ".");
		
		
	}

}
