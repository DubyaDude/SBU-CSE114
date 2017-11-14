public class TrigPrint {
	public static void main(String[] args) {
		System.out.println("Degree\t\tSin\t\tCos");
		for (int i = 0; i <= 360; i+=10) {
			System.out.println(i + "\t\t" + Math.round(Math.sin(Math.toRadians(i))*10000.0)/10000.0 + "\t\t" + Math.round(Math.cos(Math.toRadians(i))*10000.0)/10000.0);
		}
	}
}