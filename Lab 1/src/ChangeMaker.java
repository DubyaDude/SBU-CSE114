import java.util.Scanner;
public class ChangeMaker {
	public static void main(String[] args) {
		int change, rem, qs, ds, ns, ps;
		System.out.print("Input change amount (1-99): ");
		Scanner input = new Scanner(System.in);
		change = input.nextInt();
		qs = change / 25;
		rem = change % 25;
		ds = rem / 10;
		rem = rem % 10;
		ns = rem / 5;
		rem = rem % 5;
		ps = rem;
		System.out.print(qs + " quarters," + ds + " dimes,");
		System.out.println(ns + " nickels and " + ps + " pennies");
		} 
}
