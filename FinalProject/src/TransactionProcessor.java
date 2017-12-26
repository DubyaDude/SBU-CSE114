
// Driver class for the final project
import java.util.*;
import java.io.*;

public class TransactionProcessor {
	private static String getCardType(long number) {
		// Return a String indicating whether 'number' belongs to a
		// CreditCard, RewardsCard, or a PrepaidCard (or null if it's none
		// of the three)

		String result;

		int firstTwo = Integer.parseInt(("" + number).substring(0, 2));

		switch (firstTwo) {
		case 84:
		case 85:
			result = "CreditCard";
			break;
		case 86:
		case 87:
			result = "RewardsCard";
			break;
		case 88:
		case 89:
			result = "PrepaidCard";
			break;
		default:
			result = null; // invalid card number
		}

		return result;
	}

	public static BankCard convertToCard(String data) {
		Scanner scn = new Scanner(data);
		long cardNumber = scn.nextLong();
		String cardType = getCardType(cardNumber);
		String cardHolder = scn.next();

		if (cardType.equals("CreditCard")) {
			int cardExpire = scn.nextInt();
			if (scn.hasNextDouble())
				return new CreditCard(cardHolder, cardNumber, cardExpire, scn.nextDouble());
			else
				return new CreditCard(cardHolder, cardNumber, cardExpire);
		} else if (cardType.equals("RewardsCard")) {
			int cardExpire = scn.nextInt();
			if (scn.hasNextDouble())
				return new RewardsCard(cardHolder, cardNumber, cardExpire, scn.nextDouble());
			else
				return new RewardsCard(cardHolder, cardNumber, cardExpire);
		} else if (cardType.equals("PrepaidCard")) {
			if (scn.hasNextInt())
				return new PrepaidCard(cardHolder, cardNumber, scn.nextInt());
			else
				return new PrepaidCard(cardHolder, cardNumber);
		} else {
			return null;
		}
	}

	public static CardList loadCardData(String fName) {
		File f = new File(fName);
		CardList list = new CardList();
		try {
			Scanner scn = new Scanner(f);
			while (scn.hasNextLine()) {
				list.add(convertToCard(scn.nextLine()));
			}
			return list;
		} catch (IOException e) {
			return null;
		}
	}

	public static void processTransactions(String filename, CardList c) {
		try {
			File f = new File(filename);
			Scanner scn = new Scanner(f);
			while (scn.hasNextLine()) {
				String temp2 = scn.nextLine();
				String[] splitted = temp2.split(" ");
				long cardNumber = Long.parseLong(splitted[0]);
				int index = (int) c.indexOf(cardNumber);

				if (splitted[1].equals("redeem")) {
					int points = Integer.parseInt(splitted[2]);
					RewardsCard temp = (RewardsCard) c.get(index);
					temp.redeemPoints(points);
				} else if (splitted[1].equals("top-up")) {
					double money = Double.parseDouble(splitted[2]);
					PrepaidCard temp = (PrepaidCard) c.get(index);
					temp.addFunds(money);
				} else {
					Transaction t = new Transaction(splitted[1], splitted[3], Double.parseDouble(splitted[2]));
					BankCard temp = c.get(index);
					temp.addTransaction(t);
				}
			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the text file of the cards: ");
		String cardFile = input.nextLine();
		// cardFile = "carddata1.txt";
		// cardFile = "carddata2.txt";
		CardList card = loadCardData(cardFile);
		if (card == null) {
			System.out.println("Error: File incorrect format/Not found");
		} else {
			System.out.print("Please enter the text file of the transactions: ");
			String transFile = input.nextLine();
			// transFile = "transactiondata1.txt";
			// transFile = "transactiondata2.txt";
			processTransactions(transFile, card);
			for (int c = 0; c < card.size(); c++) {
				card.get(c).printStatement();
			}
		}

	}
}