package lab.ex18;
import hdm.shared.Toolbox;

public class IfElseDemo {
	public static void main(String[] args) {
		
		int eingabe = Toolbox.readInt("Zahl eingeben: ");
		
		if (eingabe == 0) {
			System.out.println("Sie haben ne 0 eingegeben");
		} else {
			if (eingabe > 0) {
				System.out.println("Sie haben eine Zahl über 0 eingegeben");
			} else {
				System.out.println("Sie haben eine Zahl unter 0 eingegeben");
			}
		} 
	}
}
