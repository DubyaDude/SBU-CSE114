
public class SortedIntegerArray {
	private int[] array;
	private int filled;
	
	public static void main(String[] args) {
		SortedIntegerArray array = new SortedIntegerArray(10);
		array.add(2);
		array.add(3);
		array.add(6);
		array.add(8);
		array.add(9);
		array.remove(2);
		System.out.println(array.toString());
	}
	
	public SortedIntegerArray(int arraySize) {
		filled = 0;
		array = new int[arraySize];
	}

	public int size() {
		return filled;
	}

	public int get(int index) {
		if (index < 0 || index > array.length) {
			return -1;
		}
		return array[index];
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < filled; i++) {
			output += " " + Integer.toString(array[i]);
		}
		return output;
	}

	public void add(int n) {
		if (filled >= array.length) {
			return;
		} else if (filled == 0) {
			array[0] = n;
			filled++;
			return;
		}

		for (int i = filled; i >= 0; i--) {
			if (n < array[i]) {
				array[i + 1] = array[i];
			} else {
				array[i] = n;
				filled++;
				break;
			}
		}
	}

	public void remove(int index) {
		for (int i = index; i < filled; i++) {
			int shift = array[i + 1];
			array[i] = shift;
		}
	}
}
