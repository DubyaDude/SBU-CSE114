public class GroceryList {
	private GroceryItem[] mylist = null;
	int numberOfItemInList;

	public GroceryList() {
		mylist = new GroceryItem[10];
		this.numberOfItemInList = 0;
	}

	public void add(GroceryItem item) {
		if (numberOfItemInList < 10) {
			mylist[numberOfItemInList] = item;
			numberOfItemInList++;
		}
	}

	public double getTotalCost() {
		double totalCost = 0;
		for (int i = 0; i < numberOfItemInList; i++) {
			totalCost += mylist[i].getCost();
		}
		return totalCost;
	}

}