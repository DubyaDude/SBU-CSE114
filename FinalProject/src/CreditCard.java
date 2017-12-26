
public class CreditCard extends BankCard {
	private int expireDate;
	protected double creditLimit;

	public CreditCard(String cardHolder, long cardNumber, int expiration, double limit) {
		super(cardHolder, cardNumber);
		expireDate = expiration;
		creditLimit = limit;
	}

	public CreditCard(String cardHolder, long cardNumber, int expiration) {
		super(cardHolder, cardNumber);
		expireDate = expiration;
		creditLimit = 500.00;
	}

	public double limit() {
		return creditLimit;
	}

	public double availableCredit() {
		return creditLimit - curBal;
	}

	public int expiration() {
		return expireDate;
	}

	@Override
	public String toString() {
		return ("Card # " + cardNum + " Expiration Date: " + expireDate + " Balance: $" + curBal);
	}

	@Override
	public boolean addTransaction(Transaction t) {
		if (t.type().equals("debit")) {
			if (t.amount() <= availableCredit()) {
				curBal += t.amount();
				transactionList.add(t);
				return true;
			} else {
				return false;
			}
		} else if (t.type().equals("credit")) {
			curBal += t.amount();
			transactionList.add(t);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void printStatement() {
		System.out.println("Statement:");
		System.out.println(toString());
		for (Transaction i : transactionList)
			System.out.println(i);
	}
}
