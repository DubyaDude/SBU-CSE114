
public class Stock {
	String symbol,name;
	double previousClosingPrice, currentPrice;
	
	public Stock(String s, String n, double p, double c) {
		symbol=s;
		name=n;
		previousClosingPrice=p;
		currentPrice=c;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrevPrice() {
		return previousClosingPrice;
	}
	
	public double getCurPrice() {
		return currentPrice;
	}
	
	public void setPrevPrice(int p) {
		previousClosingPrice=p;
	}
	
	public void setCurPrice(int c) {
		currentPrice=c;
	}
	
	public double changePercent(double prev, double cur) {
		return ((cur-prev)/prev)*100.0;
	}
	
	public String toString() {
		return "Symbol: " + getSymbol() + "\tPrice Percentage Change: " + changePercent(getPrevPrice(),getCurPrice());
	}
}
