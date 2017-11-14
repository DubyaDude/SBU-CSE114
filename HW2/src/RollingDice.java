import java.util.*;

public class RollingDice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter #d#: ");
		String userInput = input.nextLine();
		rollDice(userInput);
	}

	public static void rollDice(String userInput) {
		int numOfRoles = Integer.parseInt(userInput.substring(0, userInput.indexOf("d")));
		int sidesOfDice = Integer.parseInt(userInput.substring(userInput.indexOf("d") + 1, userInput.length()));
		int total = 0;
		for (int i = 1; i <= numOfRoles; i++) {
			total += (int) (Math.random() * sidesOfDice) + 1;
		}
		System.out.println(total);
	}
}