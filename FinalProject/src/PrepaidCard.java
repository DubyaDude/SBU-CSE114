
public class PrepaidCard extends BankCard {

	public PrepaidCard(String cardholderName, long cardNumber, double balance) {
		super(cardholderName, cardNumber);
		curBal = balance;
	}

	public PrepaidCard(String cardholderName, long cardNumber) {
		super(cardholderName, cardNumber); // curBal=0
	}

	@Override
	public boolean addTransaction(Transaction t) {
		if (t.type().equals("debit")) {
			if (t.amount() <= curBal) {
				curBal -= t.amount();
				transactionList.add(t);
				return true;
			} else {
				return false;
			}
		} else if (t.type().equals("credit")) {
			curBal -= t.amount();
			transactionList.add(t);
			return true;
		} else {
			return false;
		}
	}

	public boolean addFunds(double amount) {
		if (amount >= 0) {
			curBal += amount;
			Transaction t = new Transaction("top-up", "User payment", -amount);
			transactionList.add(t);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void printStatement() {
		System.out.println("Statement:");
		System.out.println(toString());
		for (Transaction i : transactionList)
			System.out.println(i);
	}

}
