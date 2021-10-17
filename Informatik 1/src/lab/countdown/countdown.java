package lab.countdown;

import java.util.Calendar;      //used to differentiate between under the week and an weekends
import hdm.shared.Toolbox;      //used to play the music after the countdown gets under 31 seconds
import processing.core.PApplet; 
import processing.core.PFont;
import processing.core.PImage;

public class countdown extends PApplet {
	
	//Global Variables / functions 
	String timeBlock = nextBlock();
	PFont frutiger;
	PImage HDMLogo;
	String countdownHours   = ""; //used for the 30 second if event
	String countdownMinutes = ""; //used for the 30 second if event
	String countdownSeconds = ""; //used for the 30 second if event

	public static void main(String[] args) {
		PApplet.main(new String[] { countdown.class.getName() });
	}

	public void settings() {
		//sets window size
		size(1680, 1050);
	}

	public void setup() {
		//loads HDM Logo and text font
		HDMLogo = loadImage("lab/countdown/media/HDMLogo.png");
		frutiger = createFont("lab/countdown/media/Frutiger Neue LT Bold.ttf", 30);	
		
	}
	
	public void draw() {
		
		//general variables used in draw
		String timeNow = getTime(); 
		String weekend = isWeekend();
		String timeDiff = timeDifference(timeNow, timeBlock);
		String timeDiffString = timeDiff;
		String tIndicator = "T- Test ";
		int countdownLength = timeDiffString.length();
			
		
		//position variables upper rectangle with text
		int YposUpperRect = -250;
		int YposTextUhrzeit = -225;
		int YposTextGetTime = -175;
		
		//position and scale variables middle rectangle with text
		int YposMiddleRect = CENTER - 100; //sets Y position of the middle rectangle
		int XposMiddleRect = CENTER - 450; //sets X position of the middle rectangle
		int widthMiddleRect = 900;		   //sets width of the middle rectangle
		int heightMiddleRect = 200;		   //sets height of the middle rectangle
		int YposTextEsGehtWeiterIn = -50;  //sets Y position of the "Es Geht weiter in" text
		int YposTextTimeDiff = 50;		   //sets Y position of the Countdown text
		int scaleTextTimeDiff = 50;		   //sets scale of the Countdown text
		
		//position variables lower rectangle with text
		int YposLowerRect = 150;
		int YposTextNächsterBlock = 175;
		int YposTextTimeBlock = 225;
		
		
		/* changes the T- to T+ after the Countdown is over.
		 * if the String length ("HH:MM:SS" = 8) gets longer because of a minus ("HH:MM:-SS" = 9)
		 * it changes the T- to T+
		 */
		if(countdownLength == 8) {
			tIndicator = "T- ";
		} else {
			tIndicator = "T+ ";
		}

		
		/* if the Countdown reaches 31 seconds or any key gets pressed, this
		 * moves the upper and lower rectangles with text away and scales the Middle rectangle with the Countdown up. While it is doing that,
		 * it plays the 31 second audio of the Apollo 11 Countdown and start.
		 */
		if( (countdownHours.charAt(0) == '0' && countdownHours.charAt(1) == '0') &&											//checks if hours (HH) are 00 
			(countdownMinutes.charAt(0) == '0' && countdownMinutes.charAt(1) == '0') &&										//checks if Minutes (MM) are 00	
		    ((countdownSeconds.charAt(0) == '3' && countdownSeconds.charAt(1) <= '1') || countdownSeconds.charAt(0) < '3')  //checks if seconds are above 31 OR below 30
		    || //or
		    (key == ' ') /* if key pressed = true */
		    ) {
			//this if cost me about 7 Hours because I used for example " countdownHours.charAt(0) == 0 " and not " countdownHours.charAt(0) == '0' "
			//thanks to the first answer at: https://stackoverflow.com/questions/21068134/charat-equals-causes-char-cannot-be-dereferenced that said to use '' 
			
			Toolbox.playAudioFileAsychronously("/lab/countdown/media/Apollo 11 Launch Countdown.wav"); //Apollo 11 Countdown: https://www.youtube.com/watch?v=8V9TCD0TTtk
			//move upper rectangle with text 100px up
			YposUpperRect = -350; 
			YposTextUhrzeit = -325;
			YposTextGetTime = -275;
			
			//scale middle rectangle and countdown text up and adjust the position
			//adjust position
			YposMiddleRect = CENTER - 200;
			XposMiddleRect = CENTER - 550;
			//make rectangle bigger by 200px in Y and Y
			widthMiddleRect = 1100;
			heightMiddleRect = 400;
			YposTextEsGehtWeiterIn = -150; 	//move "Es geht weiter in" text up by 100px
			YposTextTimeDiff = 25;		    //move Countdown text up by 25px
			scaleTextTimeDiff = 150;        //scale Countdown text up from 50 to 150
			
			//move lower rectangle with text 100px down
			YposLowerRect = 250;
			YposTextNächsterBlock = 275;
			YposTextTimeBlock = 325;
		}
		
		
		//general design decisions
		background(255);
		translate(width/2, height/2);
		textAlign(CENTER, CENTER);
		textFont(frutiger);
		
		
		//gray Banner at the top
		fill(62, 72, 71);
		rect(-840, -475, 1680, 75);
		fill(255);
		text("COUNTDOWN ZUM NÄCHSTEN ZEITBLOCK", CENTER, -438);
		image(HDMLogo, -767, -497, 103, 103); //HDM Logo perfectly aligned 
		
		
		//Rectangles
		fill(228, 7, 46);
		noStroke();
		rect(CENTER - 300, YposUpperRect, 600, 100); //upper rectangle
		rect(XposMiddleRect, YposMiddleRect, widthMiddleRect, heightMiddleRect); //middle rectangle
		rect(CENTER - 300, YposLowerRect, 600, 100); //lower rectangle
		
		
		//Text options
		fill(255);
		
		//Text in upper rectangle
		text("Uhrzeit:", 0, YposTextUhrzeit);
		text(getTime(), 0, YposTextGetTime);
		
		//Text in middle rectangle
		textSize(50);
		text("Es geht weiter in:", 0, YposTextEsGehtWeiterIn);
		textSize(scaleTextTimeDiff);
		text(tIndicator + timeDiff, 0, YposTextTimeDiff);
		
		//Text in lower rectangle
		textSize(30);
		text("Nächster Block" + weekend + " um:", 0, YposTextNächsterBlock);
		text(timeBlock, 0, YposTextTimeBlock);
		
	}
	
	// -----------------------------------------------------------------------	

	//Original Code to calculate the time difference from: https://discourse.processing.org/t/countdown-d-h-min-sec-and-ms/18145/2
	String getTime() {
		//returns system time formated to HH:MM:SS
		return nf(hour(), 2) + ":" + nf(minute(), 2) + ":" + nf(second(), 2);
	}

	String timeDifference(String timeNow, String timeBlock) {
		// convert hour + min + sec to integer
		int start = time_StoI(timeNow);
		// convert hour + min + sec to integer
		int stop = time_StoI(timeBlock);
		// difference
		int difference = stop - start;

		return time_ItoS(difference);
	}

	int time_StoI(String time) {
		// convert time String to millis (expecting 11:11:03)
		int hour;
		int min;
		int sec;

		hour = ((time.charAt(0)) - 0x30) * 10 + ((time.charAt(1)) - 0x30);
		min = ((time.charAt(3)) - 0x30) * 10 + ((time.charAt(4)) - 0x30);
		sec = ((time.charAt(6)) - 0x30) * 10 + ((time.charAt(7)) - 0x30);
		int total = hour * 60 * 60 + min * 60 + sec;
		return total;
	}

	String time_ItoS(int difference) {
		countdownHours   = nf(difference / 3600, 2);
		countdownMinutes = nf((difference % 3600) / 60, 2);
		countdownSeconds = nf(difference % 60, 2);
		String timeString = countdownHours + ':' + countdownMinutes + ':' + countdownSeconds;
		return timeString;
	}
	
	//code to look if it is Weekend is inspired by: https://forum.processing.org/one/topic/day-of-the-week.html --------------------------------------------
	String isWeekend() {
		//number ranges from 1 (Sunday) to 7 (Saturday)
		int dayOfWeek;
		Calendar c = Calendar.getInstance();
		dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		if(dayOfWeek == 1 || dayOfWeek == 7) { // Sunday
			return " am Montag";
		} else { // On Weekdays
			return "";
		}
	}
	
	String nextBlock() {
		// returns the time, in which the next block starts
		if		 (hour()<=8)				  { //before 08:00 return 08:15
			return timeBlock = "08:15:00";
		} else if(hour()==8  && minute()<=15) { //before 08:00 still return 08:15
			return timeBlock = "08:15:00";
		} else if(hour()==8  && minute()>=16) { //after  08:16 return 10:00
			return timeBlock = "10:00:00";
		} else if(hour()==9) 				  {	//at     09:00 still return 10:00
			return timeBlock = "10:00:00";
		} else if(hour()==10)				  { //after  10:00 return 11:45
			return timeBlock = "11:45:00";
		} else if(hour()<=11 && minute()<=45) { //after  11:00 still return 11:45
			return timeBlock = "11:45:00";
		} else if(hour()==11 && minute()>=46) { //after  11:45 return 13:15
			return timeBlock = "13:15:00";
		} else if(hour()==12)				  { //at     12:00 still return 13:15
			return timeBlock = "13:15:00";
		} else if(hour()<=13 && minute()<=15) { //at     13:00 still return 13:15
			return timeBlock = "13:15:00";
		} else if(hour()==13 && minute()>=16) { //after  13:16 return 14:15
			return timeBlock = "14:15:00";
		} else if(hour()<=14 && minute()<=15) { //until  14:15 still return 14:15
			return timeBlock = "14:15:00";
		} else if(hour()==14 && minute()>=16) { //after  14:16 return 16:00
			return timeBlock = "16:00:00";
		} else if(hour()==15) 				  { //at     15:00 still return 16:00
			return timeBlock = "16:00:00";
		} else if(hour()<=16)				  { //at     16:00 return 17:45
			return timeBlock = "17:45:00";
		} else if(hour()<=17 && minute()<=45) { //at     17:00 still return 17:45
			return timeBlock = "17:45:00";
		} else if(hour()==17 && minute()>=46) { //after  17:46 return 19:30
			return timeBlock = "19:30:00";
		} else if(hour()==18)				  { //at     18:00 still return 19:30
			return timeBlock = "19:30:00";
		} else if(hour()<=19 && minute()<=30) { //until  19:30 still return 19:30
			return timeBlock = "19:30:00";
		} else if(hour()>=19 && minute()>=31) { //after  19:31 return 24:00
			return timeBlock = "24:00:00";
		} else if(hour()>=20) 				  { //after  20:00 still return 24:00
			return timeBlock = "24:00:00";
		} else {
			return timeBlock = "99:99:99"; // return 99:99:99 if there is an error
		}
	}
}
