import java.util.*;

public class FindLargest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = input.nextInt();
		System.out.print("Enter the number of columns: ");
		int column = input.nextInt();
		double[][] userIn = new double[row][column];

		System.out.println("Enter the array below: ");
		for (int r = 0; r < row; r++)
			for (int c = 0; c < column; c++)
				userIn[r][c] = input.nextDouble();

		int[] loc = locateLargest(userIn);
		System.out.print("The largest element is at (" + loc[0] + "," + loc[1] + ")");
	}

	public static int[] locateLargest(double[][] a) {
		int[] loc = new int[] { 0, 0 };
		double largest = a[0][0];

		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				if (a[r][c] > largest) {
					loc[0] = r;
					loc[1] = c;
					largest = a[r][c];
				}
			}
		}

		return loc;
	}
}
