public class CheckingAccount extends Account {

	private double overdraftLimit;

	public CheckingAccount(int id, double balance, double rate, double limit) {
		super(id, balance, rate);
		this.overdraftLimit = limit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public void withdraw(double amt) {
		if ((this.getBalance() - Math.abs(amt)) < overdraftLimit) {
			System.out.println("Insufficient funds");
			return;
		}
		setBalance(this.getBalance() - Math.abs(amt));
	}

	public String toString() {
		String output = " ID: ";
		output += Integer.toString(getId());
		output += "\n BALANCE: ";
		output += Double.toString(getBalance());
		output += "\n ANNUAL INTERESTRATE: ";
		output += Double.toString(getAnnualInterestRate());
		output += "\n OVERDRAFT LIMIT: ";
		output += Double.toString(overdraftLimit);

		return output;
	}

}
