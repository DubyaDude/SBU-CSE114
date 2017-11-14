import java.util.*;

public class SortByCounting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		System.out.print("Enter the min: ");
		int min = input.nextInt();
		System.out.print("Enter the max: ");
		int max = input.nextInt();

		int[] matrix = randomArray(n, min, max);
		System.out.print("\nOriginal: " + Arrays.toString(matrix));

		matrix = countingSort(matrix, min, max);
		System.out.println("\nOrganized: " + Arrays.toString(matrix));
	}

	public static int[] randomArray(int n, int min, int max) {
		int[] m = new int[n];
		for (int i = 0; i < n; i++)
			m[i] = (int) Math.floor(Math.random() * ((max-min)+1) + min); //(int) (Math.random() * (max + 1)) + min;
		return m;
	}

	public static int[] countingSort(int[] unsorted, int min, int max) {
		int[] count = new int[max - min + 1];
		for (int i = 0; i < unsorted.length; i++)
			count[unsorted[i] - min]++;

		int[] sorted = new int[unsorted.length];
		int index = 0;
		for (int j = 0; j < count.length; j++) {
			for (int k = 0; k < count[j]; k++) {
				sorted[index] = j + min;
				index++;
			}
		}
		return sorted;
	}
}