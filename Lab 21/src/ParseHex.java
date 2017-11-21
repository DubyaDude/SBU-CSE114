import java.util.*;
public class ParseHex {
	public static int parseHex(String hex) {
		int total = 0;
		int curPower = 0;
		try {
			for (int i = hex.length() - 1; i >= 0; i--) {
				char c = hex.charAt(i);
				int value = 0;

				if (c >= '0' && c < 'A') {
					value = c - '0';
				} else if (c >= 'A' && c < 'F') {
					value = c - 'A' + 10;
				} else {
					throw new HexFormatException();
				}

				total += value * Math.pow(16, curPower);
				curPower++;
			}
		} catch (HexFormatException e) {
			System.out.println("ERROR: Please input a Hex string");
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println("Enter a Hex (Uppercase):");
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		System.out.println(parseHex(input));
	}

}
