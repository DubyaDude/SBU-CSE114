import java.util.*;

public abstract class BankCard {
	private String name;
	protected long cardNum;
	protected double curBal;
	protected ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
	
	public BankCard(String cardholderName, long cardNumber) {
		name=cardholderName;
		cardNum=cardNumber;
		curBal=0;
	}
	
	public double balance() {
		return curBal;
	}
	
	public long number() {
		return cardNum;
	}
	
	public String cardHolder() {
		return name;
	}
	
	public String toString() {
		return("Card # "+cardNum+" Balance: $"+curBal);
	}
	
	public abstract boolean addTransaction(Transaction t);
	public abstract void printStatement();
}