package lab.ex53;

import processing.core.PApplet;

/**
 * Minimal skeleton code for a Processing-based Java application
 */
public class StationClock extends PApplet {

	public static void main(String args[]) {
		// Note: Method PApplet.main can take additional arguments, e.g.
		// "--present" for activating full screen mode.
		PApplet.main(new String[] { StationClock.class.getName() });
	}

	@Override
	public void settings() {
		// Setup size of output window
		size(500, 500);
	}

	@Override
	public void setup() {
		surface.setResizable(true);
	}

	@Override
	public void draw() {
		
		final int SECONDS_PER_MINUTE = 60;
		final int MINUTES_PER_HOUR = 60;
		final int HOURS_PER_FULL_CIRCLE = 12;
		final float DEGREES_PER_FULL_CIRCLE = 360;
		
		translate(width / 2, height / 2);
		background(255);
		strokeCap(SQUARE);
		
		//minute marks
		pushMatrix();
		strokeWeight(4f);
		stroke(0);
		for (int i = 0; i < MINUTES_PER_HOUR; i++) {
			line(0, -200, 0, -190);
			rotate(radians(DEGREES_PER_FULL_CIRCLE / MINUTES_PER_HOUR)); // 360 Grad durch 60 Minutenstriche
		}
		popMatrix();
		
		
		
		//Hour marks
		pushMatrix();
		strokeWeight(10f);
		stroke(0);
		for (int i = 0; i < HOURS_PER_FULL_CIRCLE; i++) {
			line(0, -200, 0, -170);
			rotate(radians(DEGREES_PER_FULL_CIRCLE / HOURS_PER_FULL_CIRCLE));
		}
		popMatrix();
		
	}
}
