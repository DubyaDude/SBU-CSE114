import java.util.Scanner;
public class ThirdWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int charLoc = 0, charEnd = 0;
		String userInput;
		
		System.out.print("Please enter a sentence with at least 4 words: ");
		userInput = input.nextLine().trim();
		
		for (int i = 0; i < 2; i++) {
			charLoc += userInput.substring(charLoc, userInput.length()).indexOf(" ") + 1;
		}
		charEnd = charLoc + userInput.substring(charLoc, userInput.length()).indexOf(" ") + 1;
		
		System.out.println("The third word is " + userInput.substring(charLoc,charEnd));
	}
}
