public class Driver {
	public static void main(String[] args) {
		StackOfObjects list = new StackOfObjects();
		Account acc = new Account(20, 1299.0, 2938.0);
		CheckingAccount acc2 = new CheckingAccount(22, 2343.0, 23.0, 3498.0);
		list.push("AA");
		list.push("BBBBB");
		System.out.println(list.pop());
		System.out.println(list.size());
		System.out.println(list.pop());
		System.out.println(list.size());

		System.out.println("Account: ");
		System.out.println(acc.toString());
		System.out.println(acc2.toString());
	}

}
