package lab.ex20;
import hdm.shared.Toolbox;

public class Grader {
	public static void main(String[] args) {
		
		int points = Toolbox.readInt("Bitte Punkte eingeben: ");
		
		if (points > 100) {
			System.out.println("So gut kann keiner sein. (change my mind)");
			} else if (points >= 96) {
			System.out.println("Note : 1,0");
			} else if (points >= 91) {
			System.out.println("Note : 1,3");
			} else if (points > 85) {
			System.out.println("Note : 1,7");
			} else if (points >= 80) {
			System.out.println("Note : 2,0");
			} else if (points >= 75) {
			System.out.println("Note : 2,3");
			} else if (points > 70) {
			System.out.println("Note : 2,7");
			} else if (points >= 65) {
			System.out.println("Note : 3,0");
			} else if (points >= 60) {
			System.out.println("Note : 3,3");
			} else if (points > 55) {
			System.out.println("Note : 3,7");
			} else if (points >= 50) {
			System.out.println("Note : 4,0");
			} else if (points >= 15) {
			System.out.println("Note : 4,7");
			} else if (points >= 0) {
			System.out.println("Note : 5,0");
			} else {
			System.out.println("bidde wat?");
			}
	}
}
 
