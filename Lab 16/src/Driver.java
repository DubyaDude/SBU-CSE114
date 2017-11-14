public class Driver{
	public static void main(String[] args) {
		Color color = new Color(240, 140, 230, "Khaki");
		System.out.println("Details of color: " + color.getColorName());
		System.out.println(" Red: " + color.getRed());
		System.out.println(" Blue: " + color.getBlue());
		System.out.println(" Green: " + color.getGreen());
		
		AlphaChannelColor alphaColor = new AlphaChannelColor(218, 214, 112, 167);
		System.out.println("Details of alpha channel color: " + alphaColor.getColorName());
		System.out.println(" Red: " + alphaColor.getRed());
		System.out.println(" Blue: " + alphaColor.getBlue());
		System.out.println(" Green: " + alphaColor.getGreen());
		System.out.println(" Transparency: " + alphaColor.getTransparency());
	}
}