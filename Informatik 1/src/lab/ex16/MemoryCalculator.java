package lab.ex16;

public class MemoryCalculator {
	public static void main(String[] args) {
		
		//Define constants
		final byte BITS_PER_BYTE = 8;
		final int BYTES_IN_MB = 1_000 * 1_000;
		final int BYTES_IN_MIB = 1_024 * 1_024;
		
		
		//Part a)
		final long CHARACTER_COUNT = 16_000;
		final byte BITS_PER_CHARACTER = 16;
		
		//Calculate
		long aInBytes = (CHARACTER_COUNT * BITS_PER_CHARACTER) / BITS_PER_BYTE; // a in Bytes ausrechnen
		double aInMB = (double)aInBytes / BYTES_IN_MB; // a Bytes in MB
		double aInMiB = (double)aInBytes / BYTES_IN_MIB; // a Bytes in MiB
		
		System.out.println("Eine Mail mit " + CHARACTER_COUNT + " Zeichen, welche " + BITS_PER_CHARACTER + "Bit pro Zeichen Nutzt, benötigt :");
		System.out.println(aInBytes + " Bytes");
		System.out.println(aInMB + " MB");
		System.out.println(aInMiB + " Mib");
		System.out.println("----------------------------------------------------------");
		
		
		//Part b)
		final long Hz = 44_100;
		final short BITS_PER_HZ = 16;
		final int DURATION_IN_SECONDS = 60;
		
		//Calculate
		long bBytesASeccond = (Hz * BITS_PER_HZ) / BITS_PER_BYTE; // Byte in einer Sekunde
		long bBytesAMinute = (bBytesASeccond * DURATION_IN_SECONDS); //Byte in eier Minute
		double bInMB = (double)bBytesAMinute / BYTES_IN_MB;
		double bInMiB = (double)bBytesAMinute / BYTES_IN_MIB;
		
		System.out.println("Eine Minute Mono-Audio mit: " + BITS_PER_HZ + " Bit pro " + Hz + " Hz, welche " + DURATION_IN_SECONDS +
				" Sekunden gespielt wird, hat: ");
		System.out.println(bBytesAMinute + " Bytes");
		System.out.println(bInMB + " MB");
		System.out.println(bInMiB + " MiB");
		System.out.println("----------------------------------------------------------");
		
		
		//Part C)
		final long PIXEL = 8_000 * 8_000;
		final short BITS_PER_PIXEL = 32;
		
		//Calculate
		long BytePerPicture = (PIXEL * BITS_PER_PIXEL) / BITS_PER_BYTE;
		double cInMB =  BytePerPicture / BYTES_IN_MB;
		double cInMiB = BytePerPicture / BYTES_IN_MIB;
		
		System.out.println("ein Bild Mit " + PIXEL + " Pixeln (8000 * 8000) und " + BITS_PER_PIXEL + " Bit/Pixel hat: " );
		System.out.println(BytePerPicture + " Bytes");
		System.out.println(cInMB + " MB");
		System.out.println(cInMiB + " MiB");
		System.out.println("----------------------------------------------------------");
		
		
		
	}

}
