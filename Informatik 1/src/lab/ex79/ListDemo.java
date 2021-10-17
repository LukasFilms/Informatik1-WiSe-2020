package lab.ex79;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		
		List <String> namen = new LinkedList<String>();
		
		namen.add("Alpha");
		namen.add("Beta");
		namen.add("Gamma");
		namen.add("Delta");
		
		namen.remove("Beta");
		
		namen.remove(1);
		
		namen.add(0, "Epsilon");
		
		System.out.println(namen.get(1));
		System.out.println(namen.size());
		
	}

}
