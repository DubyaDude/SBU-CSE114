public class Color{
	private int red;
	private int blue;
	private int green;
	private String name;

	public Color(int red, int blue, int green) {
		this.red = red;
		this.blue = blue;
		this.green = green;
		this.name = null;
	}

	public Color(int red, int blue, int green, String name) {
		this.red = red;
		this.blue = blue;
		this.green = green;
		this.name = name;
	}

//	public void setRed(int red) {
//		this.red = red;
//	}
//
//	public void setBlue(int blue) {
//		this.blue = blue;
//	}
//
//	public void setGreen(int green) {
//		this.green = green;
//	}
//
//	public void setColorName(String name) {
//		this.name = name;
//	}

	public int getRed() {
		return red;
	}

	public int getBlue() {
		return blue;
	}

	public int getGreen() {
		return green;
	}

	public String getColorName() {
		return name;
	}
}