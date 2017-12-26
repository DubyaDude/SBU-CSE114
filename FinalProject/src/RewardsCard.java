
public class RewardsCard extends CreditCard {
	protected int rewardPoints;

	public RewardsCard(String holder, long number, int expiration, double limit) {
		super(holder, number, expiration, limit);
		rewardPoints = 0;
	}

	public RewardsCard(String holder, long number, int expiration) {
		super(holder, number, expiration); // Sets credit limit to 500
		rewardPoints = 0;
	}

	public int rewardPoints() {
		return rewardPoints;
	}

	public boolean redeemPoints(int points) {
		if (points <= rewardPoints) {
			curBal -= ((double) points / 100);
			rewardPoints -= points;
			Transaction t = new Transaction("redemption", "CSEBank", (double) points / 100);
			transactionList.add(t);
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return (super.toString() + " Reward Points: " + rewardPoints);
	}
	
	@Override
	public boolean addTransaction(Transaction t) {
		boolean x = super.addTransaction(t);
		if(x==true && t.type().equals("debit"))
			rewardPoints+=t.amount()*100;
		return x;
	}
	
	@Override
	public void printStatement() {
		System.out.println("Statement:");
		System.out.println(toString());
		for (Transaction i : transactionList)
			System.out.println(i);
	}
}
