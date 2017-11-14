import java.util.Scanner;

public class miliSeconds {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter time in milli seconds: ");
		long millis = input.nextLong();
		System.out.print(convertMillis(millis) + "\n\n");
	}
	public static String convertMillis(long millis) {
		int s,m,h;
		s=(int)(millis/1000)%60;
		m=(int)(((millis/1000)%3600)/60);
		h=(int)((millis/1000)/3600);
		
		return (h + ":" + m + ":" + s);
	}
}