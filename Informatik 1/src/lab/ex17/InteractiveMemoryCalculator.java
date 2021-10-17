package lab.ex17;
import hdm.shared.Toolbox;

public class InteractiveMemoryCalculator {
	public static void main(String[] args) {
		
		//Eingabe des Benutzers
		System.out.println("Speicherplatz eines Bildes berechnen");
		int PixelHorizontal = Toolbox.readInt("Breite (in Pixel) : ");
		int PixelVertikal = Toolbox.readInt("Höhe (in Pixel) : ");
		byte Channel = Toolbox.readByte("Anzahl an Farbkanälen : ");
		int BitPerPixelAndChannel = Toolbox.readInt("Bits pro Pixel und Kanal : ");
		
		//Berechnung der angaben
		double Pixel = PixelHorizontal * PixelVertikal;
		double PixelTimesChannel = Pixel * Channel;
		double BytePerFrame = (PixelTimesChannel * BitPerPixelAndChannel) / 8;
		double ByteToMB = (double)BytePerFrame / (1000 * 1000) ;
		double ByteToMiB = (double)BytePerFrame / (1024 * 1024) ; 
		
		//ausgabe der Angaben
		System.out.println("Der Speicherplatz beträgt: \n");
		System.out.printf("rund " + BytePerFrame + " Byte\n");
		System.out.printf("rund %.2f MB \n",ByteToMB);
		System.out.printf("rund %.2f MiB \n",ByteToMiB);
	}

}
