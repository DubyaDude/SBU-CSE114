import java.util.*;

public class Triangle {
	private double s1, s2, s3;
	IllegalTriangleException IllegalTriangleException = new IllegalTriangleException();

	public static void main(String[] args) {
		System.out.println("Please enter three sides of a triangle");

		Scanner input = new Scanner(System.in);
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		Triangle A = new Triangle(s1, s2, s3);
	}

	public Triangle(double s1, double s2, double s3) {
		try {
			if (!((s1 + s2) > s3 && (s2 + s3) > s1 && (s1 + s3) > s2))
				throw IllegalTriangleException;
			this.s1 = s1;
			this.s2 = s2;
			this.s3 = s3;
			System.out.println("Triangle Created");
		} catch (IllegalTriangleException e) {
			System.out.println("ERROR: Sides not valid");
		}
	}
}