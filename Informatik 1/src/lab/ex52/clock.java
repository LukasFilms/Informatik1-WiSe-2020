package lab.ex52;

import java.text.SimpleDateFormat;
import processing.core.PApplet;

public class clock extends PApplet {
	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	public static void main (String args[]) {
		PApplet.main (new String [] { "--present", "--window-color=#000000", clock.class.getName() });
	}
	
	public void settings() {
		
		size(1000,500);
		
	}
	
	public void draw() {
		
		final int TEXT_SIZE = 200;
		
		background(0);
		
		//hours
		fill(255,0,0);
		textSize(TEXT_SIZE);
		textAlign(CENTER, CENTER);
		if (hour() < 10) {
			//hours smaller than 10, gets a leading 0
			text("0" + hour(), 150, 200);
			
		} else {
			text(hour(), 150, 200);
		}
		
		
		//Minutes
		fill(0,255,0);
		textSize(TEXT_SIZE);
		textAlign(CENTER,CENTER);
		if (minute() < 10) {
			text("0" + minute(), 500, 200);
			
		} else {
			text(minute(), 500, 200);
		}
		
		
		//Seconds
		fill(0,0,255);
		textSize(TEXT_SIZE);
		textAlign(CENTER,CENTER);
		if (second() < 10) {
			text("0" + second(), 850, 200);
			
		} else {
			text(second(), 850, 200);
		}
		
		// : between the Numbers
		if (second() % 2 == 0) {
			fill(255);
			textSize(TEXT_SIZE);
			
			text(":", 325, 200 );
			
			text(":", 675, 200 );
		}

	}

}
