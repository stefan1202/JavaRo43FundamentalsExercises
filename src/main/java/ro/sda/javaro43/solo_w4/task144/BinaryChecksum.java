package ro.sda.javaro43.solo_w4.task144;

public class BinaryChecksum {
	public static String addParityBit(String bits) {
//		return bits + (bits.replaceAll("0", "").length() & 1);
		return bits + bits.replace("0","").length()%2;
	}
}