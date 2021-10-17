package lab.ex14;
import hdm.shared.Toolbox;

public class ToolboxDemo {
	
	public static void main(String[] args) {
		int integerNumber = Toolbox.readInt("Bitte Ganzzahl eingeben : ");
		System.out.println("Sie haben " + integerNumber + " eingegeben.");
		
		double doubleNumber = Toolbox.readDouble("Bitte Fliesskommawert eingeben :");
		System.out.println("Sie haben " + doubleNumber + " eingegeben");
		
		double sum = integerNumber + doubleNumber;
		System.out.println("Die Summe ist " + sum + ".");
		
	}

}
