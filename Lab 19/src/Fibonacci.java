import java.util.*;

public class Fibonacci {
	static private ArrayList<Integer> numberList = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter N number of the sequence to calculate");
		int n = scn.nextInt();
		System.out.println("Enter P amount to print");
		int p = scn.nextInt();

		fillArray(n);
		printArray(p);

	}

	static public void fillArray(int n) {
		numberList.add(0);
		numberList.add(1);
		for (int i = 2; i < n; i++) {
			int n1 = numberList.get(i - 1);
			int n2 = numberList.get(i - 2);
			numberList.add(n1 + n2);
		}
	}

	static public void printArray(int p) {
		for (int i = 0; i < p; i++) {
			System.out.print(" " + numberList.get(i));
		}
	}
}
