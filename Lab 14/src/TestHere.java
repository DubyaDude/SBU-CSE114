
public class TestHere {
	public static void main(String[] args) {
		Fan first = new Fan();
		first.setSpeed(3);
		first.setRadius(10);
		first.setColor("yellow");
		first.setOn(true);
		System.out.println("|Fan1|  " + first);
		
		Fan second = new Fan();
		second.setSpeed(2);
		second.setRadius(5);
		second.setColor("blue");
		second.setOn(false);
		System.out.println("|Fan2|  " + second);
		
		Stock third = new Stock("GOOG", "Google Inc.", 100, 0);
		third.setCurPrice(90);
		System.out.println(third);
	}
}
