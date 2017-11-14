import java.util.*;

public class Lab8B {
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
		System.out.print("The complement is " + toTwosComplement(userInputC, userInputD));
	}

	public static String pad(String input, int howLong) {
		while (input.length() < howLong)
			input = "0" + input;
		return input;
	}

	public static String addBinary(String inputA, String inputB) {
		int carry = 0;
		String output = "";

		if (inputA.length() < inputB.length())
			inputA = pad(inputA, inputB.length());
		else if (inputB.length() < inputA.length())
			inputB = pad(inputB, inputA.length());

		for (int i = (inputA.length() - 1); i >= 0; i--) {
			int val1 = inputA.charAt(i) - '0';
			int val2 = inputB.charAt(i) - '0';

			if ((carry + val1 + val2) == 0) {
				output = "0" + output;
				carry = 0;
			} else if ((carry + val1 + val2) == 1) {
				output = "1" + output;
				carry = 0;
			} else if ((carry + val1 + val2) == 2) {
				output = "0" + output;
				carry = 1;
			} else {
				output = "1" + output;
				carry = 1;
			}
		}
		if (carry == 1)
			output = "1" + output;
		return output;
	}

	public static String toTwosComplement(int base10, int howLong) {
		String output = "";

		if (base10 >= 0) {
			output = pad(Integer.toBinaryString(base10), howLong);
		} else {
			String x = pad(Integer.toBinaryString(Math.abs(base10)), howLong);
			String str = "";
			for (int i = 0; i < x.length(); i++) {
				if (x.charAt(i) == '0')
					str += '1';
				else
					str += '0';
			}
			output = addBinary(str, "1");
		}

		if (output.length() > howLong)
			output = output.substring(1, howLong);
		return output;
	}
}