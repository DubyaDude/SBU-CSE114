public class RegularPolygon {
	private int n;
	public double data;
	
	public RegularPolygon() {
		n=3;
		data=1;
	}
	public RegularPolygon(int sides, double length) {
		n=sides;
		data=length;
	}
	public int getN() {
		return n;
	}
	public double getData() {
		return data;
	}
	public void setN(int input) {
		n=input;
	}
	public void setData(double input) {
		data=input;
	}
	public double getPerimiter() {
		return (double)n*data;
	}
	public String toString() {
		return "Sides: " + getN() + "\tLength: " + getData() + "\tPerimiter: " + getPerimiter();
	}
}
