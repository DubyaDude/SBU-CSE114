public class Fan {
	public static int SLOW = 1;
	public static int MEDIUM = 2;
	public static int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private int radius = 5;
	private String color = "blue";
	
	public Fan() {
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public String strGetSpeed() {
		if(speed == SLOW) return "SLOW";
		if(speed == MEDIUM) return "MEDIUM";
		return "HIGH";
	}
	
	public void setSpeed(int s) {
		speed=s;
	}
	
	public boolean getOn() {
		return on;
	}
	
	public void setOn(boolean o) {
		on=o;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int r) {
		radius=r;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String c) {
		color=c;
	}
	public String toString() {
		return "Status: " + (getOn()? "On" : "Off") + "\tRadius: " + getRadius() + "\tSpeed: " + strGetSpeed() + "\tColor: " + getColor();
	}
}
