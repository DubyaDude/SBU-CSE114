import java.util.Scanner;
public class ReplaceDNA {
	public static void main(String[]args) {
		String DNAorig, DNAconverted = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the DNA sequence: ");
		DNAorig = input.nextLine().toUpperCase();
		
		for(int i = 0; i < DNAorig.length(); i++){
			if(DNAorig.charAt(i) == 'T')
				DNAconverted = "A" + DNAconverted;
			else if(DNAorig.charAt(i) == 'A')
				DNAconverted = "T" + DNAconverted;
			else if(DNAorig.charAt(i) == 'G')
				DNAconverted = "C" + DNAconverted;
			else if(DNAorig.charAt(i) == 'C')
				DNAconverted = "G" + DNAconverted;
			else
				DNAconverted = "?" + DNAconverted;
		}
		System.out.println("The reverse complement is " + DNAconverted);
	}
}