import java.util.*;

public class CardList {
	private ArrayList<BankCard> cards;

	public CardList() {
		cards = new ArrayList<BankCard>();
	}

	public void add(BankCard b) {
		cards.add(b);
	}

	public void add(int index, BankCard b) {
		if(index>=0 && index<= cards.size())
			cards.add(index, b);
		else
			cards.add(b);
	}

	public int size() {
		return cards.size();
	}

	public BankCard get(int index) {
		if(index>=0 && index< cards.size())
			return cards.get(index);
		else
			return null;
	}

	public int indexOf(long cardNumber) {
		for (int i = 0; i<cards.size();i++) {
			if(cards.get(i).number()==cardNumber)
				return i;
		}
		return -1;
	}
}
