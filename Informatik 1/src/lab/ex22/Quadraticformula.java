package lab.ex22;
import hdm.shared.Toolbox;

public class Quadraticformula {
	public static void main(String[] args) {
		
		System.out.println("der Mitternachtsformel-berechnungs-inator");
		double a = Toolbox.readDouble("a : ");
		double b = Toolbox.readDouble("b : ");
		double c = Toolbox.readDouble("c : ");
		
		double under_root = (b * b) - (4 * a * c); //erst ergebnis unter der Wurzel errechen
		
		if (under_root >= 0) { //wenn die Formel möglich ist, rechnen
			double squareRoot = Math.sqrt(under_root);
		
			double up1 = (-1 * b) + squareRoot; //über dem Bruchstrich (+)
			double up2 = (-1 * b) - squareRoot;	//über dem Brichstrich (-)
		
			double down = a * 2; 				//unter dem Strich
		
			double x1 = up1 / down;				//teilen +
			double x2 = up2 / down;				//teilen -
			
			if (x1 == x2) {	// Wenn x1 und x2 gleich sind
				System.out.println("Die Gleichung hat eine Lösung : x1/x2=" + x1);
			} else { // normalerweise
			System.out.println("Die Gleichung hat zwei Lösungen : x1=" + x1 + ", x2=" + x2);
			}
		
		} else { // wenn die Gleichung nicht funktioniert
			System.out.println("Die Gleichung hat keine Lösung (- unter Wurzel)");
		}
		
		
		
		
		
		
		/*
		 * Unter der Wurzel
		 * Wurzel
		 * -b + Wurzel
		 * teilen
		 * 
		 *  -b - Wurzel
		 *  teilen
		 * 
		 */
		
		
	}

}
