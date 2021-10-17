package lab.ex21;
import hdm.shared.Toolbox;

public class IfElseSorter {
	public static void main(String[] args) {
		
		System.out.println("Der: nach-größe-aufsteigend-sortier-inator");
		
		int number1 = Toolbox.readInt("Bitte erste Zahl eingeben : ");
		int number2 = Toolbox.readInt("Bitte zweite Zahl eingeben : ");
		int number3 = Toolbox.readInt("Bitte dritte Zahl eingeben : ");
		
		System.out.println("-------------------------------------------");
		
		//Number1 ist am kleinsten
		if (number1 < number2 && number1 < number3) {
			System.out.println(number1 + " ist am kleinsten");
			if (number2 < number3){
			System.out.println(number2 + " ist in der Mitte");
			System.out.println(number3 + " ist am größten");
			}else {
			System.out.println(number3 + " ist in der Mitte");
			System.out.println(number2 + " ist am größten");
			}
		
		//number2 ist am kleinsten
		} else if (number2 < number1 && number2 < number3) {
				System.out.println(number2 + " ist am kleinsten");
				if (number1 < number3) {
					System.out.println(number1 + " ist in der Mitte");
					System.out.println(number3 + " ist am größten");
				} else {
					System.out.println(number3 + " ist in der Mitte");
					System.out.println(number1 + " ist am größten");
				}
		//number3 ist am kleinsten		
		}else if (number3 < number2 && number3 < number1) {
				System.out.println(number3 + " ist am kleinsten");
				if (number1 < number2) {
					System.out.println(number1 + " ist in der Mitte");
					System.out.println(number2 + " ist am größten");
				} else {
					System.out.println(number1 + " ist in der Mitte");
					System.out.println(number2 + " ist am größten");
				}
		}
		
		
	}
		
}
