import java.util.Arrays;
public class BubbleSort {
	public static void main(String[] args) {
		double [] input = {6.0,4.4,1.9,2.9,3.4,2.9,3.5};
		bubbleSort(input);
	}

	public static void bubbleSort (double [ ] list) {
		boolean changed = true;
		do {
			changed = false;
			for (int j = 0; j < list.length - 1; j++) {
				if (list[j] > list[j + 1]) {
					double temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					changed = true;
				}
				//System.out.println(Arrays.toString(list));
			}
		} while (changed);
		System.out.println(Arrays.toString(list));
	}
}