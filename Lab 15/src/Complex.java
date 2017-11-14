import java.text.DecimalFormat;
import java.util.*;

public class Complex {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.print("Enter the first complex number: ");
		Complex compNum1 = getComplex();
		System.out.print("Enter the second complex number: ");
		Complex compNum2 = getComplex();
		System.out.print(compNum1 + " + " + compNum2 + " = ");
		print(compNum1.add(compNum2));

		System.out.print(compNum1 + " - " + compNum2 + " = ");
		print(compNum1.subtract(compNum2));

		System.out.print(compNum1 + " * " + compNum2 + " = ");
		print(compNum1.multiply(compNum2));

		System.out.print(compNum1 + " / " + compNum2 + " = ");
		print(compNum1.divide(compNum2));

		System.out.println("|" + compNum1 + "| = " + compNum1.abs());
	}

	public static void print(Complex n) {
		if (n.getImaginaryPart() == 0)
			System.out.println(n.getRealPart());
		else
			System.out.println(n.getRealPart() + " + " + n.getImaginaryPart() + "i");
	}

	public static Complex getComplex() {
		Scanner input = new Scanner(System.in);
		double[] c = new double[2];
		for (int i = 0; i < c.length; i++)
			c[i] = input.nextDouble();
		return new Complex(c[0], c[1]);
	}

	private double a;
	private double b;

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public Complex(double a) {
		this(a, 0);
	}

	public Complex() {
		this(0);
	}

	public Complex add(Complex complex) {
		// a + bi + c + di = (a + c) + (b + d)i
		return new Complex((a + complex.a), (b + complex.b));
	}

	public Complex subtract(Complex complex) {
		// a + bi - (c + di) = (a - c) + (b - d)i

		return new Complex((a - complex.a), (b - complex.b));

	}

	public Complex multiply(Complex complex) {
		// (a + bi)*(c + di) = (ac - bd) + (bc + ad)i

		return new Complex((a * complex.a - b * complex.b), (b * complex.a + a * complex.b));

	}

	public Complex divide(Complex complex) {
		// (a+bi)/(c+di)=(ac+bd)/(c^2 +d^2)+(bc-ad)i/(c^2 +d^2)

		return new Complex((a * complex.a + b * complex.b) / ((Math.pow(complex.a, 2) + Math.pow(complex.b, 2))),
				(b * complex.a - a * complex.b) / ((Math.pow(complex.a, 2) + Math.pow(complex.b, 2))));
	}

	public double abs() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	public double getRealPart() {
		return a;
	}

	public double getImaginaryPart() {
		return b;
	}

	public String toString() {

		if (b == 0)
			return a + "";

		DecimalFormat decimal = new DecimalFormat("#.###");
		return "(" + decimal.format(a) + " + " + decimal.format(b) + "i)";

	}

}