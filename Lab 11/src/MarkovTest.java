import java.util.*;

public class MarkovTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][3];

		System.out.println("Enter a 3 by 3 matrix, row by row:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}

		 System.out.println("This is" + (isMarkovMatrix(matrix) ? " " : " not ") + "a positive Markov matrix");
	}

	public static boolean isMarkovMatrix(double[][] m) {
		boolean isPositive = true;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] < 0)
					isPositive = false;
			}
		}

		boolean columnSum = true;
		for (int col = 0; col < m.length; col++) {
			double sum = 0;
			for (int row = 0; row < m.length; row++) {
				sum += m[row][col];
			}
			if (sum != 1)
				columnSum = false;
		}
		return isPositive && columnSum;
	}
}
