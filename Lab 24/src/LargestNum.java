import java.util.*;

public class LargestNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("How long is the array: ");
		int[] intArray = new int[scn.nextInt()];
		System.out.print("Please enter all ints in the array: ");
		for(int i = 0; i<=intArray.length-1;i++) {
			intArray[i]=scn.nextInt();
		}
		System.out.println("Largest int: " + findLargest(intArray,intArray.length-1));
	}

	public static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static int findLargest(int[] list, int currentIndex) {
		if(currentIndex>=0) {
			return (max(list[currentIndex], findLargest(list,currentIndex-1)));
		}
		return 0;
	}
}
