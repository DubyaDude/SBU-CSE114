public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;

	public Account() {
		id = 0;
		balance = 1000.0;
		annualInterestRate = 4.5;
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 4.5;
	}

	public Account(int id, double balance, double rate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.0;
	}

	public void withdraw(double amount) {
		if ((balance - Math.abs(amount)) < 0) {
			System.out.println("Insufficient funds");
			return;
		}
		balance -= Math.abs(amount);
	}

	public void deposit(double amount) {
		balance += Math.abs(amount);
	}

	public String toString() {
		String output = " ID: ";
		output += Integer.toString(id);
		output += "\n BALANCE: ";
		output += Double.toString(balance);
		output += "\n ANNUAL INTERESTRATE: ";
		output += Double.toString(annualInterestRate);

		return output;
	}

}
