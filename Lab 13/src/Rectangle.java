public class Rectangle {
	private double width,height;
	private String color="white";
	
	public Rectangle() {
		width=1;
		height=1;
	}
	public Rectangle(double w, double h) {
		width=w;
		height=h;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public String getColor() {
		return color;
	}
	public void setWidth(double w) {
		width=w;
	}
	public void setHeight(double h) {
		height=h;
	}
	public void setColor(String c) {
		color = c;
	}
	public double getPerimiter() {
		return (width*2)+(height*2);
	}
	public double getArea() {
		return height*width;
	}
	public String toString() {
		return "Width:" + getWidth() + "\tHeight:" + getHeight() + "\tColor:" + getColor() + "\tPerimiter:" + getPerimiter() + "\tArea:" + getArea();
	}
}
