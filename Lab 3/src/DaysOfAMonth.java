import java.util.Scanner;
public class DaysOfAMonth {
	public static void main(String[] args) {
		int inputYear, inputMonth, days;
		String[] month = new String[13];
		month[1] = "January"; month [2] = "February"; month[3] = "March"; month[4] = "April"; month[5] = "May"; month[6] = "June"; month[7] = "July"; month[8] = "August"; month[9] = "September"; month[10] = "October"; month[11] = "November"; month[12] = "December";
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the month (1-12): ");
		inputMonth = input.nextInt();
		System.out.print("Please enter the year: ");
		inputYear = input.nextInt();
		
		if(inputMonth == 1 || inputMonth == 3 || inputMonth == 5 || inputMonth == 7 || inputMonth == 8 || inputMonth == 10 || inputMonth == 12 )
			days = 31;
		else if(inputMonth == 4 || inputMonth == 6 || inputMonth == 9 || inputMonth == 11)
			days = 30;
		else if(inputMonth == 2)
			if(inputYear%4 != 0)
				days = 28;
			else if(inputYear%100 != 0)
				days = 29;
			else if(inputYear%400 != 0)
				days = 28;
			else
				days = 29;
		else
			days=0;
		
		System.out.println(month[inputMonth] + " " + inputYear + " has " + days + " days.");
	}
}
