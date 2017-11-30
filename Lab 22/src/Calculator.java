import java.util.*;

public class Calculator {
	static DivideByZero DivideByZero= new DivideByZero();
	static IncorrectOperation IncorrectOperation= new IncorrectOperation();
	static WrongAmount WrongAmount = new WrongAmount();
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter a calculation to perform: ");
		String input = scn.nextLine();

		try {
			input=input.trim();
			String[] array = input.split(" ");
			double A = Double.parseDouble(array[0]);
			double B = Double.parseDouble(array[2]);

			if (array[1].equals("+"))
				System.out.print(A + B);
			else if (array[1].equals("-"))
				System.out.print(A - B);
			else if (array[1].equals("*"))
				System.out.print(A * B);
			else if (array[1].equals("/"))
				if(B==0)
					throw DivideByZero;
				else
					System.out.print(A / B);
			else if (array[1].equals("%"))
				System.out.print(A % B);
			else {
				throw IncorrectOperation;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Incorrect Amount Of Values!");
		} catch (DivideByZero e) {
			System.out.println("Division by zero is illegal");
		} catch (IncorrectOperation e) {
			System.out.println(input.substring(2,3) + " is an invalid operator");
		} catch(NumberFormatException e) {
			System.out.println("Incorrect Format");
		}
	}
}