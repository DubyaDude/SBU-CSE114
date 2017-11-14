import java.util.*;

public class CountingValues {
	public static void main(String[] args) {
		int arrayLength = 10;
		int[] random = new int[arrayLength];
		int[] manual = { 51, 80, 0, 46, 44, 44, 100, 58, 80, 86 };
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) Math.floor(Math.random() * 101);
		}
		System.out.print("MANUAL \n");
		valueCounter(manual);
		System.out.print("\nRANDOM \n");
		valueCounter(random);
	}

	public static void valueCounter(int[] values) {
		System.out.println("Original Array: " + Arrays.toString(values) + "\n");

		int[] possible = new int[101];
		Map<Integer, Integer> output = new HashMap<Integer, Integer>();

		for (int i = 0; i < values.length; ++i) {
			possible[values[i]] = possible[values[i]] + 1;
			output.put(values[i], possible[values[i]]);
		}
		output.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time(s).");
		});
	}
}
