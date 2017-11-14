import java.util.*;

public class CreateMagicSquare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a size for the magic square (odd): ");
		int userInput = input.nextInt();
		int[][] magicSquare = createSquare(userInput);

		for (int i = 0; i < magicSquare.length; i++) {
			for (int j = 0; j < magicSquare.length; j++) {
				System.out.print(magicSquare[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static int[][] createSquare(int size) {
		int[][] magic_matrix = new int[size][size];
		int number = 1;
		int row = 0;
		int column = size/2;
		int current_row;
		int current_column;
		while (number <= (size*size)) {
			magic_matrix[row][column] = number;
			number++;
			current_row = row;
			current_column = column;
			row--;
			column--;
			if(row <= -1) 
				row = size - 1;
			if(column <= -1) 
				column = size - 1;
			if(magic_matrix[row][column] != 0) {
				row = current_row + 1;
				column = current_column;
				if(row <= -1) 
					row = size - 1;
			}
		}
				return magic_matrix;
	}
}
