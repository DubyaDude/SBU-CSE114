import java.util.Scanner;
public class CalendarPrint {
	public static void main(String[]args) {
		int days, offset;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of days in the Month: ");
		days = input.nextInt();
		System.out.print("Enter the offset value: ");
		offset = input.nextInt();
		
		for (int i = 0; i < offset; i++)
			System.out.print("   ");
		for (int i = 1; i <= days; i++) {
			if (i < 10)
				System.out.print("  " + i);
			else
				System.out.print(" " + i);
			if ((i + offset) % 7 == 0)
				System.out.println();
		}
	}
}
