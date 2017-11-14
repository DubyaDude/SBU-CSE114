public class GroceryItem {
	private String itemName;
	private int itemQuantity;
	private double unitPrice;

	public static void main(String[] args){
		GroceryList list = new GroceryList();
		
		GroceryItem apple = new GroceryItem("Apple", 2, 2.99);
		list.add(apple);

		GroceryItem candy= new GroceryItem("Candy", 5, 1.10);
		list.add(candy);

		GroceryItem sauce = new GroceryItem("Sauce", 1, 1.50);
		list.add(sauce);

		GroceryItem meat = new GroceryItem("Meat", 1, 3.5);
		list.add(meat);

		GroceryItem chips = new GroceryItem("Chips", 5, 0.45);
		list.add(chips);

		GroceryItem blueberries = new GroceryItem("Blueberries", 10, 2.45);
		list.add(blueberries);

		System.out.printf("Total cost of the list is: $ %.2f", list.getTotalCost());
	}

	public GroceryItem(String name, int quantity, double price) {
		this.itemName = name;
		this.itemQuantity = quantity;
		this.unitPrice = price;
	}

	public void setQuantity(int quantity) {
		this.itemQuantity = quantity;
	}

	public double getCost() {
		return this.itemQuantity * this.unitPrice;
	}

}