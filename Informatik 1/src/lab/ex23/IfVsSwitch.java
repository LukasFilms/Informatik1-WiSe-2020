package lab.ex23;
import hdm.shared.Toolbox;

public class IfVsSwitch {
	public static void main(String[] args) {
		
		char gender = Toolbox.readChar("Anrede (H=Herr, F=Frau): ");
		
		switch (gender) {
		case 'f': 
			System.out.print("Guten Tag die Dame!");
			break;
			
		case 'h':
			System.out.print("Guten Tag der Herr!");
			break;
			
		default:
			System.out.print("Guten Tag.");
		}
	}

}
