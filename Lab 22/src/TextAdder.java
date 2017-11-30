import java.io.*;
import java.util.*;
public class TextAdder {
	public static void main(String[]args) {
		File f = new File("test.txt");
		double total = 0;
		double amount = 0;
		try {
			Scanner scn = new Scanner(f);
			while(true) {
				total+= scn.nextDouble();
				amount++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found");
		} catch (NoSuchElementException e) {
			System.out.println("Total: " + total);
			System.out.println("Avg: " + total/amount);
		}
	}
}