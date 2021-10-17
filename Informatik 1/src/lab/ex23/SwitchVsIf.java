package lab.ex23;
import hdm.shared.Toolbox;

public class SwitchVsIf {
	public static void main(String[] args) {
		
		char c = Toolbox.readChar("Bitte einen kleinen Buchstaben eingeben: ");
		
		if ( (c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u') ) {
			System.out.println("Buchstabe ist ein Vokal.");
		} else {
			System.out.println("Buchstabe ist kein Vokal.");
		}
		
	}

}
