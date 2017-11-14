import java.util.Scanner;

public class backSpaceH {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String userInput = input.nextLine();
		System.out.print("Conversion: " + backspace(userInput));
	}

	public static String backspace(String userInput) {
		String output = userInput + "";
		while (output.indexOf("^H") != -1) {
			output = output.substring(0, output.indexOf("^H") - 1)
					+ output.substring(output.indexOf("^H") + 2, output.length());
		}
		return output;
	}
}
