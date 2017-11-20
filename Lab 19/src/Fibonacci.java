import java.util.*;

public class Fibonacci {
	static private ArrayList<Integer> numList = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N:");
		int n = input.nextInt();
		System.out.println("Enter P:");
		int p = input.nextInt();

		fillArray(n);
		printArray(p);

	}

	static public void fillArray(int n) {
		numList.add(0);
		numList.add(1);
		for (int i = 2; i < n; i++) {
			int n1 = numList.get(i - 1);
			int n2 = numList.get(i - 2);
			numList.add(n1 + n2);
		}
	}

	static public void printArray(int p) {
		for (int i = 0; i < p; i++) {
			System.out.print(" " + numList.get(i));
		}
	}
}
