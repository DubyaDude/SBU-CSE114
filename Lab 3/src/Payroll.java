import java.util.Scanner;
public class Payroll {
	public static void main(String[] args) {
		String name;
		double hoursWorked, hourlyPay, federalTax, stateTax, deductFederal, deductState, netPay;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		name = input.nextLine();
		System.out.print("Enter the number of hours worked this week: ");
		hoursWorked = input.nextDouble();
		System.out.print("Enter the hourly pay rate: ");
		hourlyPay = input.nextDouble();
		System.out.print("Enter the federal tax withholding rate: ");
		federalTax = input.nextDouble();
		System.out.print("Enter the state tax withholding rate: ");
		stateTax = input.nextDouble();
		System.out.println("");
		
		deductFederal = federalTax*(hourlyPay * hoursWorked);
		deductState = stateTax*(hourlyPay * hoursWorked);
		netPay = (hourlyPay * hoursWorked) - (deductFederal + deductState);
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Pay Rate: $" + hourlyPay);
		System.out.println("Gross Pay: $" + hourlyPay * hoursWorked);
		System.out.println("");
		System.out.println("Deductions:");
		System.out.println("");
		System.out.println("Federal Withholding(" + federalTax*100 + "%): $" + Math.floor(deductFederal*100)/100);
		System.out.println("State Withholding(" + stateTax*100 + "%): $" + Math.floor(deductState*100)/100);
		System.out.println("");
		System.out.println("Total Deduction: $" + Math.floor((deductFederal + deductState)*100)/100);
		System.out.println("");
		System.out.println("Net Pay: $" + Math.floor(netPay*100)/100);	
	}

}
