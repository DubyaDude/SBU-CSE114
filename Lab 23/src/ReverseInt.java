import java.util.*;
public class ReverseInt {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Ender a integer to reverse: ");
		int input = scn.nextInt();
		reverseDisplay(input);
	}

	private static void reverseDisplay(int input) {
		if(input>0) {
			System.out.print(input%10);
			reverseDisplay(input/10);
		}
	}
}
