import java.util.*;
public class HeadsAndTails{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		int userInput = input.nextInt();
		String binary = pad(Integer.toBinaryString(userInput),9);
		printHT(binary);
	}
	public static String pad(String input, int howLong) {
		while (input.length() < howLong) {
			input = "0" + input;
		}
		return input;
	}
	public static void printHT(String binary) {
		int goToNextLine = 0;
		for(int i=0;i<binary.length();i++){
			goToNextLine++;
			if(binary.charAt(i)=='0')
				System.out.print("H");
			else
				System.out.print("T");
			if(goToNextLine==3){
				System.out.println();
				goToNextLine = 0;
			} else
				System.out.print(" ");
		}
	}

}