import java.util.Scanner;

public class encodedExpand {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String userInput = input.nextLine();
		System.out.print("Decoded: " + expand(userInput));
	}

	public static String expand(String userInput) {
		String output = "";
		for (int i = 0; i < userInput.length(); i += 2) {
			for (int k = 0; k < Character.getNumericValue(userInput.charAt(i + 1)); k++) {
				output = output + userInput.charAt(i);
			}
		}
		return output;
	}
}
