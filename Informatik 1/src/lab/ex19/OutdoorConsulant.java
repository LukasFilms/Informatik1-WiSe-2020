package lab.ex19;
import hdm.shared.Toolbox;

public class OutdoorConsulant {
	public static void main(String[] args) {
		
		int eingabe = Toolbox.readInt("Wie Warm ist es? ");
		
		if (eingabe >= 30 ) {
			System.out.println("Bitte Sonnencreme und Hut einpacken.");
		} else {
			if (eingabe >= 0) {
				System.out.println("Bitte Regenschirm mitnehmen (passt meistens).");
			} else {
				if (eingabe >= -20) {
					System.out.println("Bitte Handschuhe, M�tze und w�rmendes Smartphone nicht vergessen.");
				} else {
						System.out.println("Achtung Eisb�ren! Besser Zuhause bleiben.");
					}
				}
			}
		}	
	}
