public class TestHere {
	public static void main(String[]args) {
		RegularPolygon first = new RegularPolygon(5,10);
		RegularPolygon second = new RegularPolygon(12,14);
		
		
		System.out.println("|RegularPolygon1|  " + first);
		System.out.println("|RegularPolygon2|  " + second);
		System.out.println();
		
		Rectangle third = new Rectangle(4,40);
		Rectangle fourth = new Rectangle(3.5,39);
		
		third.setColor("red");
		fourth.setColor("red");
		

		System.out.println("|Recangle1|  " + third);
		System.out.println("|Recangle2|  " + fourth);
	}
}
