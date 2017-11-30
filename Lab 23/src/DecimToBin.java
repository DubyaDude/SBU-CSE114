import java.util.*;

public class DecimToBin {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a integer to convert to binary: ");
		int input = scn.nextInt();
		System.out.print(dec2Bin(input));
	}

	public static String dec2Bin(int value) {
		int a;
		if (value > 0) {
			a = value % 2;
			return (dec2Bin(value / 2) + "" + a);
		}
		return "";
	}
}