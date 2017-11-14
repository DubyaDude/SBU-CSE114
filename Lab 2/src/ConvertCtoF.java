import java.util.Scanner;
public class ConvertCtoF {
	public static void main(String[] args) {
		double faren, cel;
		System.out.print("Enter a temperature in Celsius: ");
		Scanner input = new Scanner(System.in);
		cel = input.nextDouble();
		faren = (9.0/5) * cel +32;
		System.out.print(cel + " degrees in Celsius is " + faren + " degrees in Fahrenheit");
		}
}