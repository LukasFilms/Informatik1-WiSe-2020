package lab.ex44;
import hdm.shared.Toolbox;

public class Superfrog {
	public static void main(String[] args) {
		
		System.out.println("Sprung, Gesamtweite");
		
		// creating two Variables to calculate the way Quaxi moved
		double jump = Toolbox.randomDouble(0.40, 0.80); 
		double way = 0;
		
		while (way <= 5) { //while he is not across the rode (5M)
			jump = Toolbox.randomDouble(0.40, 0.80); // create a different jumplength every time
			way = way + jump;	// adding the newest jump to the whole way
			System.out.println(jump + ", " + way);
		}
		
		System.out.println("Drüben!");
		
	}

}
