// CSE 114 Lab 20 (Fall 2017)
//
// Your name: Usman Shafiq
// Your SBU ID: 110089155

import java.util.*;

public class Trouble {
	public static void main(String[] args) {
		boolean success = true;
		try {
			problem();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Alpha");
			success = false;
		} catch (NullPointerException e) {
			System.out.println("Beta");
			success = false;
		} catch (ArithmeticException e) {
			System.out.println("Gamma");
			success = false;
		}
		if (success) {
			System.out.println("Delta");
		}
	}

	private static void problem() {
		Random r = new Random();

		int action = r.nextInt(4);

		if (action == 1) {
			System.out.println("About to generate an ArrayIndexOutOfBoundsException...");
			throw new ArrayIndexOutOfBoundsException();
		}

		if (action == 2) {
			System.out.println("About to generate a NullPointerException...");
			throw new NullPointerException();
		}

		if (action == 3) {
			System.out.println("About to generate an ArithmeticException...");
			throw new ArithmeticException();
		}

	}
}