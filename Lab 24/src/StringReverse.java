import java.util.*;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a string to reverse: ");
		String input = scn.nextLine();
		System.out.print(reverse(input,input.length()-1));
	}

	private static String reverse(String source, int highIndex) {
		if (highIndex >= 0) {
			return (source.substring(highIndex,highIndex+1) + reverse(source, highIndex - 1));
		}
		return "";
	}
}
