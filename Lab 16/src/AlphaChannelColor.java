public class AlphaChannelColor extends Color{
	private int transparency;

	public AlphaChannelColor(int red, int blue, int green, int transparency) {
		super(red, blue, green);
		this.transparency = transparency;
	}

	public AlphaChannelColor(int red, int blue, int green, String name, int transparency) {
		super(red, blue, green, name);
		this.transparency = transparency;
	}

	public void setTransparency(int transparency) {
		this.transparency = transparency;
	}

	public int getTransparency() {
		return transparency;
	}

	public String getColorName() {
		String colorName = super.getColorName();
		if (colorName == null)
			colorName = "color";
		if (transparency < 100)
			return "opaque " + colorName;
		else if (transparency >= 100 && transparency < 200)
			return "semi-transparent " + colorName;
		else
			return "transparent " + colorName;
	}
}