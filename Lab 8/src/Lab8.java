import java.util.*;

public class Lab8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first binary: ");
		String userInputA = input.nextLine();
		System.out.print("Enter the second binary: ");
		String userInputB = input.nextLine();
		System.out.print("The sum is " + addBinary(userInputA, userInputB));

		System.out.println("\n");
		System.out.print("Enter a base 10 value: ");
		int userInputC = input.nextInt();
		System.out.print("Enter desired length in bits: ");
		int userInputD = input.nextInt();
		System.out.print("The complement is " + twosComplement(userInputC, userInputD));
	}

	public static String pad(String input, int howLong) {
		while (input.length() < howLong) {
			input = "0" + input;
		}
		return input;
	}

	public static String addBinary(String inputA, String inputB) {
		return "" + Integer.toBinaryString(Integer.parseInt(inputA, 2) + Integer.parseInt(inputB, 2));
	}

	public static String twosComplement(int base10, int howLong) {
		if (base10 >= 0) {
			return pad(Integer.toBinaryString(base10), howLong);
		} else {
			String binary = pad(Integer.toBinaryString(Math.abs(base10)), howLong);
			String binaryNew = "";
			for (int i = 0; i < binary.length(); i++) {
				if (binary.charAt(i) == '0')
					binaryNew = binaryNew + "1";
				else
					binaryNew = binaryNew + "0";
			}
			if(binaryNew.charAt(binaryNew.length()-1) == '0')
				binaryNew=binaryNew.substring(0,binaryNew.length()-1);
			binaryNew = binaryNew + "1";
			return binaryNew;
		}
	}
}